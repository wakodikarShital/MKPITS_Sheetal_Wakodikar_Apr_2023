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
    const cities=new Array("nagpur","mumbai","delhi");
    for(counter=0;counter<cities.length;counter++){
      console.log(cities[counter]);
      document.write(cities[counter]);
    }
}

