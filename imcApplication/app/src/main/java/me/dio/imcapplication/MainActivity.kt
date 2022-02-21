package me.dio.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
       // Log.w("Lifecycle", "entrei no CREATE - estou criando a tela")
    }

    private fun setListeners() {
        edt_altura?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        edt_peso?.doOnTextChanged { text, _, _, _ ->
            txt_tittle?.text = text
        }
        btn_calcular.setOnClickListener {
            calcularIMC(edt_peso.text.toString(), edt_altura.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            var srcResultado = "Seu IMC é %.2f. Classificado como: ".format(imc)
            when {
                imc <= 18.5 -> srcResultado += "'Abaixo do peso'"
                imc < 25 -> srcResultado += "'Peso Normal'"
                imc < 30 -> srcResultado += "'Sobrepeso'"
                imc < 35 -> srcResultado += "'Obesidade Grau I'"
                imc < 40 -> srcResultado += "'Obesidade Grau II'"
                else -> srcResultado += "''Obesidade Grau III ou Mórbida''"
            }
            txt_tittle.text = srcResultado
        }
    }
}