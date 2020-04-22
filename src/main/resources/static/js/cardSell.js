$(document ).ready(function(){
    
	//TODO
	var i;
	$.get("/getCardPerso", function(data){
		for(i=1;i<3;i++){
			if (i==1){
				fillCurrentCard(dataCard);
			}		    
			alert("Data: " + dataCard);
			addCardToList(dataCard);
		}
	});
});

$(".ui vertical animated button").click(function(){
	  $.post("/sell", {id: this.getAttibute("data-cardId")}, function(result){
		  alert(result);
	  });
	  alert("ok");
});


function fillCurrentCard(data){
    //FILL THE CURRENT CARD
    $('#cardFamilyImgId')[0].src=data.imgUrlFamily;
    $('#cardFamilyNameId')[0].innerText=data.familyName;
    $('#cardImgId')[0].src=data.imgUrl;
    $('#cardNameId')[0].innerText=data.name;
    $('#cardDescriptionId')[0].innerText=data.description;
    $('#cardHPId')[0].innerText=data.hp+" HP";
    $('#cardEnergyId')[0].innerText=data.energy+" Energy";
    $('#cardAttackId')[0].innerText=data.attack+" Attack";
    $('#cardDefenceId')[0].innerText=data.defence+" Defence";
    $('#cardPriceId')[0].innerText=data.price+" $";
};


function addCardToList(data){
    
    content="\
    <td> \
    <img  class='ui avatar image' src='"+data.imgUrl+"'> <span>"+data.name+" </span> \
   </td> \
    <td>"+data.description+"</td> \
    <td>"+data.familyName+"</td> \
    <td>"+data.hp+"</td> \
    <td>"+data.energy+"</td> \
    <td>"+data.attack+"</td> \
    <td>"+data.defence+"</td> \
    <td>"+data.price+"$</td>\
    <td>\
        <div class='ui vertical animated button' tabindex='0' data-cardId="+data.id+">\
            <div class='hidden content'>Sell</div>\
    <div class='visible content'>\
        <i class='shop icon'></i>\
    </div>\
    </div>\
    </td>";
    
    $('#cardListId tr:last').after('<tr>'+content+'</tr>');
    
    
};