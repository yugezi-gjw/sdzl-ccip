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
        $("#chestAdvDiv").show();
        $("#galactophoreAdvDiv").hide();
    } else if (value == 'galactophore') {
        $("#chestAdvDiv").hide();
        $("#galactophoreAdvDiv").show();
    }
}

function clickSearch(code) {
    let url = "patient/bodypart/" + code
    $("#advForm").removeAttr('action');
    $("#advForm").removeAttr('class');
    $("#advForm").removeAttr('onsubmit');
    $("#advForm").attr('action', url);
    $("#advForm").attr('class', "pageForm");
    $("#advForm").attr('onsubmit', "return navTabSearch(this);");
    $("#advForm").submit();
}

// function clickExp(code) {
//     let s = $("#stage").val();
//     let hrefv = 'excel/' + code + '/exp?stage=' + s;
//     $("#exp").attr('href', hrefv);
//     $("#exp").submit();
// }
function clickExp(code) {
    let url = "excel/" + code + "/exp"
    $("#advForm").removeAttr('action');
    $("#advForm").removeAttr('class');
    $("#advForm").removeAttr('onsubmit');
    $("#advForm").attr('action', url);
    $("#advForm").submit();
}