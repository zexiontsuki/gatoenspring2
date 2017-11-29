function turno()
{
    alert("hola");
    $.get("turno/siguiente.htm",{alto: "1", ancho:"1" },function(data)
        {
            alert(data);
        }
    );
}








