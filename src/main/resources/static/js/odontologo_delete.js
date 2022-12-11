function deleteBy(id) {
    //con fetch invocamos a la API de odontologos con el método DELETE
    //pasandole el id en la URL
    const url = '/odontologos/eliminar' + id;
    const settings = {
        method: 'DELETE'
    }
    fetch(url, settings)
        .then(response => response.json())

    //borrar la fila del odontologo eliminado
         let row_id = "#tr_" + id;

        confirm("Esta seguro de borrar este usuario?") ? document.querySelector(row_id).remove() : document.location.reload();




       /* alert = '<div class="alert alert-danger alert-dismissible">' +
            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
            '<strong> Error intente nuevamente</strong> </div>'
        $("#response").append(errorAlert);
        $("#response").css({"display": "block"});*/



}