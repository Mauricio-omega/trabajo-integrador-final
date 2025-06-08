function mostrarArticulos() {
  const categoria = document.getElementById('categoria').value;
  const articulos = document.getElementById('articulo');
  
  articulos.disabled = true;
  
  for (let i = 0; i < articulos.children.length; i++) {
    const optgroup = articulos.children[i];
    if (optgroup.tagName.toLowerCase() === 'optgroup') {
      optgroup.style.display = 'none';
    }
  }
  
  if (categoria) {
    for (let i = 0; i < articulos.children.length; i++) {
      const optgroup = articulos.children[i];
      if (optgroup.tagName.toLowerCase() === 'optgroup' && optgroup.label === categoria) {
        optgroup.style.display = '';
      }
    }
    articulos.disabled = false;
    articulos.value = '';
  } else {
    articulos.value = '';
  }
}


function mostrarValores() {
  const apellidoNombre = document.getElementById('persona').value.trim();
  const calle = document.getElementById('direccion').value.trim();
  const numeroTel = document.getElementById('telefono').value.trim();
  const localidad = document.getElementById('localidad').value.trim();
  const cp = document.getElementById('cp').value.trim();
  const selectArticulo = document.getElementById('articulo');
  const productoSeleccionado = selectArticulo.options[selectArticulo.selectedIndex]?.value.trim();
  const cantidadStr = document.getElementById('cantidad').value.trim();
  const cantidad = parseInt(cantidadStr, 10);

  if (
    !apellidoNombre ||
    !calle ||
    !numeroTel ||
    !localidad ||
    !cp ||
    !cantidadStr ||
    !productoSeleccionado || 
    productoSeleccionado === "Elegi tu producto" 
  ) {
    alert("Por favor, completa todos los campos del formulario");
    return;
  }

  if (isNaN(cantidad) || cantidad <= 0) {
    alert("Por favor, ingresa una cantidad válida mayor a cero.");
    return;
  }

  if (cantidad === 1) {
    alert("Has comprado 1 unidad del producto: " + productoSeleccionado + ". Muchas gracias por tu compra.");
  } else if (cantidad > 1) {
    alert("Has comprado " + cantidad + " unidades del producto: " + productoSeleccionado + ". Muchas gracias por tu compra.");
  }
}


function volverPagina() {
    window.location.href = "Untitled-2.html"
}