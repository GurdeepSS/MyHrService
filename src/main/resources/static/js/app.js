var empManagerModule = angular.module('empManagerApp', ['ngAnimate']);

empManagerModule.controller('empManagerController', function ($scope,$http) {
	
	var urlBase="";
	$scope.toggle=true;
	$scope.selection = [];
	$scope.martialStatus=['MARRIED','WIDOWED','SEPARATED','DIVORCED','SINGLE'];
	$scope.immigrationStatus=['CITIZEN','IMMIGRANT','NON-IMMIGRANT'];
	$http.defaults.headers.post["Content-Type"] = "application/json";

    function findAllEmployee() {
        //get all employees and display initially
        $http.get(urlBase + '/employees').
            success(function (data) {
                if (data._embedded != undefined) {
                    $scope.employeeList = data._embedded.employees;
                } else {
                    $scope.employeeList = [];
                }
                
                
                for (var i = 0; i < $scope.employeeList.length; i++) {
                        $scope.selection.push($scope.employeeList[i].empId);
                }
                
                $scope.firstName="";
                $scope.middleName="";
                $scope.lastName="";
                $scope.dob="";
                $scope.martialStatus="";
                $scope.nationality="";
                $scope.ssn="";
                $scope.immigrationStatus="";
              
            });
    }

    findAllEmployee();

	//add a new task
	$scope.addEmployee = function addEmployee() {
//		if($scope.firstName=="" || $scope.lastName=="" || $scope.dob == "" || $scope.martialStatus == ""
//			|| $scope.nationality=="" || $scope.ssn == "" || $scope.immigrationStatus == "" ){
//			alert("Insufficient Data! Please provide values for name, Date of Birth, nationality and SSN");
//		}
		if($scope.firstName=="" || $scope.lastName=="" || $scope.dob == ""  ){
			alert("Insufficient Data! Please provide values for name, Date of Birth, nationality and SSN");
		}
		else{
		 $http.post(urlBase + '/employees', {
			 firstName: $scope.firstName,
			 middleName: $scope.middleName,
			 lastName: $scope.lastName,
//			 dob: $scope.dob,
			 dob: 1469084400000,
			 martialStatus: "1",
			 nationality: $scope.nationality,
			 ssn: $scope.ssn,
			 immigrationStatus: "1",
             timeCreated: 1453363200000,
             timeUpdated: 1453363200000
         }).
		  success(function(data, status, headers) {
			 alert("Employee added");
             var newEmployeeUri = headers()["location"];
             console.log("Might be good to GET " + newEmployeeUri + " and append the Employee.");
             // Refetching EVERYTHING every time can get expensive over time
             // Better solution would be to $http.get(headers()["location"]) and add it to the list
             findAllEmployee();
		    });
		}
	};
		
	// toggle selection for a given Employee by Employee id
	  $scope.toggleSelection = function toggleSelection(employeeUri) {
	    var idx = $scope.selection.indexOf(employeeUri);
	    console.log("Url" + $employeeUri);
	    console.log("IDX" + idx);
	    

	    // is currently selected
        // HTTP PATCH to ACTIVE state
	    if (idx > -1) {
//	      $http.patch(taskUri, { taskStatus: 'ACTIVE' }).
//		  success(function(data) {
//		      alert("employee unmarked");
//		      findAllEmployee();
//		    });
	      $scope.selection.splice(idx, 1);
	    }

	    // is newly selected
        // HTTP PATCH to COMPLETED state
	    else {
//	      $http.patch(taskUri, { taskStatus: 'COMPLETED' }).
//		  success(function(data) {
//			  alert("Task marked completed");
//			  findAllEmployee();
//		    });
	      $scope.selection.push(employeeUri);
	    }
	  };
	  
	
	// Archive Completed Tasks
	  $scope.archiveTasks = function archiveTasks() {
//          $scope.selection.forEach(function(taskUri) {
//              if (taskUri != undefined) {
//                  $http.patch(taskUri, { taskArchived: 1});
//              }
//          });
          alert("Successfully Archived");
          console.log("It's risky to run this without confirming all the patches are done. when.js is great for that");
          findAllTasks();
	  };
	
});

//Angularjs Directive for confirm dialog box
empManagerModule.directive('ngConfirmClick', [
	function(){
         return {
             link: function (scope, element, attr) {
                 var msg = attr.ngConfirmClick || "Are you sure?";
                 var clickAction = attr.confirmedClick;
                 element.bind('click',function (event) {
                     if ( window.confirm(msg) ) {
                         scope.$eval(clickAction);
                     }
                 });
             }
         };
 }]);