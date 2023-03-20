const botoes = document.querySelectorAll("button");
const caixa = document.querySelector("#caixa");
let soma = 0;

botoes.forEach(botao => {
    botao.addEventListener("click", () => {
        soma += parseInt(botao.textContent);
        caixa.value = soma;
		
		
		
    });
});
