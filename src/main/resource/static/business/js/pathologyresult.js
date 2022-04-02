
function savePathologyResultCallback(form) {
    return saveItemCallback(form, 'pathologyResultForm', 'pathologyResultDiv');
}

function deletePathologyResult(id) {
    let url = 'pathology_result/del?id=' + id;
    return deleteItem(url, 'pathologyResultForm', 'pathologyResultDiv');
}

