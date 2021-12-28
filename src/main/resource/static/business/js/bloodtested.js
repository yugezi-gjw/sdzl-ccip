
function saveItemCallback(form) {
    let $form = $(form);

    // if (!$form.valid()) {
    //     return false;
    // }
    $.ajax({
        type: form.method || 'POST',
        url:$form.attr("action"),
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            divRefresh('bloodTestedForm', 'bloodTestedDiv');
        },
        error: DWZ.ajaxError
    });

    return false;
}

function deleteItem(id) {
    alertMsg.confirm("确定要删除吗?", {
        okCall: function(){
            $.ajax({
                type: 'POST',
                url: 'bloodtested/del?id=' + id,
                dataType:"json",
                cache: false,
                success: function () {
                    divRefresh('bloodTestedForm', 'bloodTestedDiv');
                },
                error: DWZ.ajaxError
            });
        }
    });
}
