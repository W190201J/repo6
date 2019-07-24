const token_key="jwtToken";

//将服务器返回的Token存储在本地
function setJwtToken(token){
	localStorage.setItem(token_key,token);
}

//获取本地存储的Token
function getJwtToken(){
	return localStorage.getItem(token_key);
}

//移除Token
function removeJwtToken(){
	localstorage.removeItem(token_key);
}

//创建带Token Header的请求头
function createTokenHeader(){
	token=getJwtToken();
	if(token){
		return {'authortion':token};
	}else{
		return {};
	}
}
