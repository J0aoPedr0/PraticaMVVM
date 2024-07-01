package com.example.mvvm
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val textWelcome = MutableLiveData<String>()
    private val password = MutableLiveData<Boolean>()
    private val repository = PersonRepository()

    init{
        textWelcome.value = "João Pedro"
    }

    fun welcome():LiveData<String>{
       return textWelcome
    }
    fun login():LiveData<Boolean>{
        return password
    }

    fun doLogin(email: String, password: String){
        this.password.value = repository.login(email,password)
    }

}