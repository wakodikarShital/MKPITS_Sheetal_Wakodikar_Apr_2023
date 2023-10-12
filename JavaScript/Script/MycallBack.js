function myFun(number1,number2){
    console.log("Sum = "+(number1+number2));
}
function myFun1(number1,number2,callback){
    document.write("Total = "+(number1+number2));
    callback();
}


function display(){
   document.write("Display Sum of two numbers : ");
}
