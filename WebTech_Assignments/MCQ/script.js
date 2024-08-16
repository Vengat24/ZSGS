const data = {
    "question1": [
        {
            "q": "<img src='./images/question1.png' alt='Question Image'>",
            "o1": "Complier Error",
            "o2": "true\n"+"class [I",
            "o3": "false\n"+"class [Int",
            "o4": "false\n"+"class [I",
            "a": "false\n"+"class [I"
        }
    ],
    "question2": [
        {
            "q": "<img src='./images/question2.png' alt='Question Image'>",
            "o1": "IF , ELSE , ELSE_IF",
            "o2": "ELSE",
            "o3": "IF",
            "o4": "ELSE - IF",
            "a": "IF"
        }
    ],
    "question3": [
        {
            "q": "<img src='./images/question3.png' alt='Question Image'>",
            "o1": "Static to Non Static Reference",
            "o2": "Instance Variable Should be Initialized before using",
            "o3": "Both A & B",
            "o4": "None of The Above",
            "a": "Both A & B"
        }
    ],
    "question4": [
        {
            "q": "<img src='./images/question4.png' alt='Question Image'>",
            "o1": "Compiler Error",
            "o2": "Runtime Error",
            "o3": "Panalam! Its Perfectly Legalll",
            "o4": "None of the Above",
            "a": "Compiler Error"
        }
    ],
    "question5": [
        {
            "q": "<img src='./images/question5.png' alt='Question Image'>",
            "o1": "Overriding",
            "o2": "Overloading",
            "o3": "Both A & B",
            "o4": "None of the Above",
            "a": "Overloading"
        }
    ],
    "question6": [
        {
            "q": "<img src='./images/question6.png' alt='Question Image'>",
            "o1": "5",
            "o2": "3",
            "o3": "Compiler Error",
            "o4": "Runtime Error",
            "a": "Runtime Error"
        }
    ],
    "question7": [
        {
            "q": "<img src='./images/question7.png' alt='Question Image'>",
            "o1": "Main",
            "o2": "Static \n Main",
            "o3": "Instance \n Static \n Main",
            "o4": "Static \n Instance \n Main",
            "a": "Static \n Main"
        }
    ],
    "question8": [
        {
            "q": "<img src='./images/question8.png' alt='Question Image'>",
            "o1": "Main",
            "o2": "Compiler Error",
            "o3": "Runtime Error",
            "o4": "No Output",
            "a": "Main"
        }
    ],
    "question9": [
        {
            "q": "<img src='./images/question9.png' alt='Question Image'>",
            "o1": "Main",
            "o2": "Compiler Error",
            "o3": "Runtime Error",
            "o4": "No Output",
            "a": "Main"
        }
    ],
    "question10": [
        {
            "q": "<img src='./images/question10.png' alt='Question Image'>",
            "o1": "Main\n0",
            "o2": "Main\nhello",
            "o3": "Main\nh",
            "o4": "Compiler Error",
            "a": "Main\nhello"
        }
    ]
};

const datum = Object.keys(data);
for (const element of datum) {
    createDiv(element);
}

var score = 0;
function createDiv(element) {
    var box = document.getElementById("box");

    var container = document.createElement("div");
    container.classList.add("container");

    var question = document.createElement("div");
    question.classList.add("question");

    // Get the index of the current element in datum array
    var index = datum.indexOf(element) + 1;  // +1 to make it 1-based index

    // Use the actual question from data
    var questionText = data[element][0].q;

    // Set the question text including the index
    question.innerHTML = questionText;
    
    var option = document.createElement("div");
    option.classList.add("option");

    var option1 = document.createElement("button");
    option1.innerText = data[element][0].o1;
    
    option1.addEventListener("click",()=>{
        if(data[element][0].o1 == data[element][0].a){
            option1.style.backgroundColor = "rgb(131, 254, 131)";
            score+= 1;
            document.getElementById("total").innerText = score;
        }else{
            option1.style.backgroundColor = "rgb(255, 51, 51)";
            
        }
        correctAns();
        disableBtn();
    });

    var option2 = document.createElement("button");
    option2.innerText = data[element][0].o2;

    option2.addEventListener("click",()=>{
        if(data[element][0].o2 == data[element][0].a){
            option2.style.backgroundColor = "rgb(131, 254, 131)";
            score+= 1;
            document.getElementById("total").innerText = score;
        }else{
            option2.style.backgroundColor = "rgb(255, 51, 51)";
            
        }
        correctAns();
        disableBtn();
    });



    var option3 = document.createElement("button");
    option3.innerText = data[element][0].o3;

    option3.addEventListener("click",()=>{
        if(data[element][0].o3 == data[element][0].a){
            option3.style.backgroundColor = "rgb(131, 254, 131)";
            score+= 1;
            document.getElementById("total").innerText = score;
        }else{
            option3.style.backgroundColor = "rgb(255, 51, 51)";
        }
        correctAns();
        disableBtn();
    });

    var option4 = document.createElement("button");
    option4.innerText = data[element][0].o4;

    option4.addEventListener("click",()=>{
        if(data[element][0].o4 == data[element][0].a){
            option4.style.backgroundColor = "rgb(131, 254, 131)";
            score+= 1;
            document.getElementById("total").innerText = score;
        }else{
            option4.style.backgroundColor = "rgb(255, 51, 51)";
           
        }
        correctAns();
        disableBtn();
    });


    option.append(option1, option2, option3, option4);
    container.append(question, option);
    box.append(container);

    function disableBtn(){
        option1.disabled = true;  
        option2.disabled = true;  
        option3.disabled = true;        
        option4.disabled = true;  
    }

    function correctAns(){

        if(data[element][0].o1 == data[element][0].a){
            option1.style.backgroundColor = "green";
        }else if(data[element][0].o2 == data[element][0].a){
            option2.style.backgroundColor = "green";
        }else if(data[element][0].o3 == data[element][0].a){
            option3.style.backgroundColor = "green";
        }else if(data[element][0].o4 == data[element][0].a){
            option4.style.backgroundColor = "green";
        }
    }

    document.getElementById("reset").addEventListener("click",()=>{
        // Reset button styles to default
        option1.style.backgroundColor = "";
        option2.style.backgroundColor = "";
        option3.style.backgroundColor = "";
        option4.style.backgroundColor = "";

        option1.style.color = "";
        option2.style.color = "";
        option3.style.color = "";
        option4.style.color = "";
        
        container.style.backgroundColor = "";
        question.style.color = "";


        // Re-enable all buttons
        option1.disabled = false;
        option2.disabled = false;
        option3.disabled = false;
        option4.disabled = false;

        document.getElementById("total").innerText = 0;
        score = 0;
}); 
}

function submit(){
    document.getElementById("submit").style.visibility = "visible";
    document.getElementById("submit").style.height = "590px";
    document.getElementById("submitchild").style.height = "200px";
    document.getElementById("reset").style.visibility = "hidden";
    document.getElementById("submitcard").style.visibility = "hidden";
    document.getElementById("box").style.visibility = "hidden";
    document.getElementById("footer").style.visibility = "hidden";
    document.getElementById("box").style.overflow = "hidden";
    document.getElementById("box").style.height = "0px";
}

function reload(){
    location.reload();
}