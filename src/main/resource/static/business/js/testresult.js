
function saveTestResultCallback(form) {
    return saveItemCallback(form, 'testResultForm', 'testResultDiv');
}

function deleteTestResult(id) {
    let url = 'testresult/del?id=' + id;
    return deleteItem(url, 'testResultForm', 'testResultDiv');
}

