function saveFormAndRefresh(saveform, refreshForm, refreshDiv) {
    let $form = $(saveform);
    $.ajax({
        type: saveform.method || 'POST',
        url:$form.attr("action"),
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            alertMsg.correct('您的数据提交成功！');
            divRefresh(refreshForm, refreshDiv);
            $.pdialog.closeCurrent();
        },
        error: DWZ.ajaxError
    });

    return false;
}

function saveChest(form) {
    return saveFormAndRefresh(form, 'chestForm', 'chestDiv');
}

function saveGalactophore(form) {
    return saveFormAndRefresh(form, 'galactophoreForm', 'galactophoreDiv');
}

function changeBodypart(value) {
    if (value == 'chest') {
        $("#chestDiv").attr("style", "display: block;");
        $("#galactophoreDiv").attr("style", "display: none;");
    } else if (value == 'galactophore') {
        $("#chestDiv").attr("style", "display: none;");
        $("#galactophoreDiv").attr("style", "display: block;");
    }
}