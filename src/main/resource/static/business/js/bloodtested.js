
function saveBloodTestedCallback(form) {
    return saveItemCallback(form, 'bloodTestedForm', 'bloodTestedDiv');
}

function deleteBloodTested(id) {
    let url = 'bloodtested/del?id=' + id;
    return deleteItem(url, 'bloodTestedForm', 'bloodTestedDiv');
}

