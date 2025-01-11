const result = document.querySelector("#result");
const formula = document.querySelector("#formula");
const calLog = document.querySelector("#calLog");
const clickNum = document.querySelectorAll(".numLine > td");
var input = ""; // 계산식 담을 변수

document.addEventListener("keydown", (e) => {
    const k = e.key;
    const s = "+-*/."; // 입력 가능한 기호
    if (!isNaN(k) || s.includes(k)) { // k가 not a number가 아니거나(=number이거나), "+-*/."일 경우
        input += k;
        formula.innerHTML = input;
    } else if (k === "Enter") {
        try {
            var calculation = eval(input);
            // eval은 js에 직접 개입할수 있어서 보안상 문제있음.
            // (!isNaN(k) || s.includes(k))처럼 입력할 값을 제한하면 괜춘.
            const logs = calLog.querySelectorAll("br");
            calculation = parseFloat(calculation.toFixed(5));
            result.innerHTML = calculation;
            calLog.innerHTML += `${input} = ${calculation} <br>`;
            if (logs.length > 9) {
                calLog.innerHTML = calLog.innerHTML.split("<br>").slice(1).join("<br>");
            }
            formula.innerHTML = "";
        } catch (e) {
            result.innerHTML = "Error😅";
        }
    } else if (k === "Backspace") {
        input = input.slice(0, -1);
        formula.innerHTML = input;
    } else if (k === "Escape") {
        input = "";
        formula.innerHTML = "";
        result.innerHTML = "";
    }
});

clickNum.forEach(i => {
    i.addEventListener("click", (e) => {
        const k = e.target.innerHTML;
        const s = "+-*/.";
        if (!isNaN(Number(k)) || s.includes(k)) {
            input += k;
            formula.innerHTML = input;
        } else if (k === "Enter") {
            try {
                var calculation = eval(input);
                const logs = calLog.querySelectorAll("br");
                calculation = parseFloat(calculation.toFixed(5));
                result.innerHTML = calculation;
                calLog.innerHTML += `${input} = ${calculation} <br>`;
                if (logs.length > 9) {
                    calLog.innerHTML = calLog.innerHTML.split("<br>").slice(1).join("<br>");
                }
                formula.innerHTML = "";
            } catch (e) {
                result.innerHTML = "Error😅";
            }
        } else if (k === "C") {
            input = "";
            formula.innerHTML = "";
            result.innerHTML = "";
        }
    });
});


