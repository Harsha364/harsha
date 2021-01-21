<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<style>

.h{
background-color:Black;
text-align:left;
color:white;

padding-top:10px;
padding-bottom:10px;


padding-left:10px;
padding-right:50px;



margin-left:450px;
margin-right:450px;


margin-top:200px;
margin-bottom:30px;
}



.f{



text-align:left;
color:Black;

padding-top:20px;
padding-bottom:20px;


padding-left:50px;
padding-right:50px;



margin-left:450px;
margin-right:450px;


margin-top:0px;
margin-bottom:0px;
}



.p{
border-style:solid;
}


.c{
margin-left:0px;

padding-left:10px;
padding-right:10px;

padding-top:3px;
padding-bottom:3px;


}
 
</style>
</head>
<b>
<body bgcolor=#D1D2CD background="std.jpg" bgcolor=#D1D2CD ng-app="myApp" ng-controller="myCtrl" ng-submit="fun($event)" >

<font face="arial" >
<h3 class="h" >Student Login </h3>
<form  action="login"  class="f"  >

<center>
<div >

<p><input type="email" placeholder="Enter Registered Email" ng-model="uname"></p>
<p><div style="color:blue">{{msg1}}</div></p>
<p><input type="password" placeholder="Enter Password" ng-model="pass"></p>
<p><div style="color:green">{{msg2}}</div></p>
<p><center><input class="c" type="submit" value="Login"></center> </p>
<p><div style="color:red">{{msg3}}</div></p>

</div>
</center>

<script>
var app = angular.module("myApp", []);

app.controller("myCtrl", function($scope) {

    $scope.uname = "";
    $scope.pass = "";
    $scope.msg1="";
    $scope.msg2="";
    $scope.msg3="";
    
    $scope.fun=function(e){
    
    if($scope.uname.length == 0 ){
    $scope.msg1="Enter your registered mail ";
    e.preventDefault();
    }
    
    else if($scope.uname == "harsha@gmail.com" && $scope.pass == "12345"){
     $scope.msg2=" Login Successful .. .... ...... ";
    e.preventDefault();  
    }
    
    else {
     $scope.msg3=" Login Failed .. .... ...... ";
    e.preventDefault();   
    }
  } 
});
</script>
</form>
</body>
</b>
</html>
