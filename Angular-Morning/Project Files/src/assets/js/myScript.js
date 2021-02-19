function deleteRow(row)
{
    var i=row.parentNode.parentNode.rowIndex;
    document.getElementById('AUTable').deleteRow(i);
}


function insRow()
{
    var x=document.getElementById('AUTable');
    var new_row = x.rows[1].cloneNode(true);
    var len = x.rows.length;
    new_row.cells[0].innerHTML = len;
    var inp1 = new_row.cells[1].getElementsByTagName('input')[0];
    inp1.id += len;
    inp1.value =(' {{box.value}} ');
    x.appendChild( new_row );
}