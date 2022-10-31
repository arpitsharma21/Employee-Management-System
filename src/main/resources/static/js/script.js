console.log("Checking app");

const toggleSidebar = () => {
	console.log("toggle is working");
	if($(".sidebar").is(":visible")){
		 $(".sidebar").css("display","none");
		 $(".content").css("margin-left","0%");
	}
	else{
		$(".sidebar").css("display","block");
		 $(".content").css("margin-left","20%");
	}
}

// Contact Form
const contactUs = (event) => {
    console.log("Checking system");

    const userName =    document.querySelector('#contactName');
    const userEmail =   document.querySelector('#contactEmail');
    const userSubject = document.querySelector('#contactSubject');
    const userMessage = document.querySelector('#contactMessage');

    swal({
        text: `Name- ${userName.value} \nEmail- ${userEmail.value} \nSubject- ${userSubject.value} \nMessage- ${userMessage.value}`,
        icon: 'success'
    });
    [userName.value, userEmail.value, userSubject.value, userMessage.value] = ['', '', '', ''];
}