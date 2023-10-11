function getMarks(marks){
    if(marks>=50){
        alert("pass")
    }else{
        alert("fail")
    }
}

//------ From user input

function marksUser(){
    marks=prompt("Enter marks :")
    if(marks>=50)
    alert("pass")
    else
    alert("fail")
}

//------ Applied validation on that the text block

function validate(number){
    if(number.length==0){
        alert("Enter the value first")
        return false;
    }
}

//------ Shows the list of cities on browser and on console log also

function myArray(){
    const cities=new Array("nagpur ","mumbai ","delhi ");
    for(counter=0;counter<cities.length;counter++){
      console.log(cities[counter]);
      document.write(cities[counter]);
    }
}

//------ Array of element by indexing

function indexing(){
    const vehical=[];
    vehical[0]="car , ";
    vehical[1]="scooter , ";
    vehical[2]="Auto ";
    for(number=0;number<vehical.length;number++){
        document.write(vehical[number])
    }
}

//----- arrays element input from user
const value = new Array(5);
let counter=0;
function addInArray(){
   
    for(counter=0;counter<value.length;counter++){
        value=prompt("Enter the value : ")
        if(value==" "){
        alert("Array terminated");
        break;
        }else{
           continue;
        }

    }

}

function display(){
    document.write(value[counter]);
}

