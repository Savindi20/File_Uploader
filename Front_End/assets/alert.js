function SuccessAlert(vale, value2) {
    Swal.fire({
        position: 'bottom-end',
        icon: 'success',
        title: vale + ' has been ' + value2,
        showConfirmButton: false,
        timer: 2500
    });
}

function unSuccessAlert(vale,vale2) {
    Swal.fire({
        position: 'bottom-end',
        icon: 'error',
        title: vale + " "+vale2,
        showConfirmButton: false,
        timer: 1500
    })
}