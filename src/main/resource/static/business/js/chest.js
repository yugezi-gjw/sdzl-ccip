function saveChest(form) {
    let $form = $(form);
    $.ajax({
        type: form.method || 'POST',
        url:$form.attr("action"),
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            alertMsg.correct('您的数据提交成功！');
            divRefresh('chestForm', 'chestDiv');
            $.pdialog.closeCurrent();
        },
        error: DWZ.ajaxError
    });

    return false;
}