package com.example.materialdesing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var userInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Aqui van a ir las vistas a las variables
        userInput = findViewById(R.id.user)
        passwordInput = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)

        //Aqui voy a configurar el evento de clic del boton de inicio de sesion
        loginButton.setOnClickListener {
            valirdarCredenciales()
        }

    }
    //Aqui es la funcion para validar los camops y autenticar
    private fun valirdarCredenciales() {
        val username = userInput.text.toString().trim()
        val password = passwordInput.text.toString().trim()

        //validacion para que los campos no esten vacios
        if (username.isEmpty()){
            userInput.error = "El usuario es requeridod"
            return
        }
        if (password.isEmpty()){
            passwordInput.error = "La contraseña es requerida"
            return
        }

        //Valida la longitud minima de la contraseña
        if (password.length < 6){
            passwordInput.error = "La contraseña debe tener al menos 6 caracteres"
            return
        }

        //Aqui va la autenticacion
        if (username == "AdminAlvin" && password == "gato321"){
            //aqui va si las credenciales son correctas, abre la pantalla de bienvenida
            val intent = Intent(this, pagenextlogin::class.java)//aqui falta pasarle la pantalla a la que ira
            startActivity(intent)
            finish() //y que cierre la pantalla de inicio de sesion
        }else{
            //si las credenciales son incorrectas
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}