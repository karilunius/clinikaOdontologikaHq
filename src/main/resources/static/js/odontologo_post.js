$(document).ready(function() {
    
    $("#add_new_odontologo").submit(function (evt) {
        evt.preventDefault();
        
        let formData = {
            matricula: $("#matricula").val(),
            nombre: $("#nombre").val(),
            apellido: $("#apellido").val(),
        }
        
        
        $.ajax({
            url: 'http://localhost:8080/odontologos/nuevo',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(formData),
            dataType: 'json',
            async: false,
            cache: false,
        });
        
        function resetUploadForm() {
            $("#matricula").val("");
            $("#nombre").val("");
            $("#apellido").val("");
        
        }
        console.log(resetUploadForm());
        console.log(alert("Guardado exitosamente"));
        
    });
    
    
    
    
    
    
});

