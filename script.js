document.getElementById("inicio").addEventListener("submit", function(e) {
    e.preventDefault(); 
    validarFormulario();
});

function irPagina() {
    window.location.href = "Untitled-2.html";
}

function validarFormulario() {
    let usuario = document.getElementById("usuario").value;
    let contraseña = document.getElementById("contraseña").value;

    if (usuario === "") {
        alert("Por favor ingrese su usuario");
        return false;
    } else if (contraseña === "") {
        alert("Por favor ingrese la contraseña");
        return false;
    } else if (usuario != "nicolas"){
        alert("Usuario incorrecto");
        return false;
    }else if (contraseña != 12345){
        alert("Contraseña incorrecta") 
        return false
    } else if (usuario == "nicolas" && contraseña == 12345){
        irPagina();
        return true;
    }
}


