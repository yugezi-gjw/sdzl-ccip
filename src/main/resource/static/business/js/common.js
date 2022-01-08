function divRefresh(formId, rel) {
    var $form = $("#" + formId);
    // if ($form[DWZ.pageInfo.pageNum]) $form[DWZ.pageInfo.pageNum].value = 1;
    if (rel) {
        var $box = $("#" + rel);
        $box.ajaxUrl({
            type: "POST",
            url: $form.attr("action"),
            data: $form.serializeArray(),
            callback: function () {
                $box.find("[layoutH]").layoutH();
            }
        });
    }
    return false;
}

function deleteItem(url, formId, refreshDiv) {
    alertMsg.confirm("确定要删除吗?", {
        okCall: function(){
            $.ajax({
                type: 'POST',
                url: url,
                dataType:"json",
                cache: false,
                success: function () {
                    divRefresh(formId, refreshDiv);
                },
                error: DWZ.ajaxError
            });
        }
    });
}

function saveItemCallback(form, formId, refreshDivId) {
    let $form = $(form);
    $.ajax({
        type: form.method || 'POST',
        url:$form.attr("action"),
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            divRefresh(formId, refreshDivId);
        },
        error: DWZ.ajaxError
    });

    return false;
}