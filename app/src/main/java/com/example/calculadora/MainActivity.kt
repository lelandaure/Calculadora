package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operation: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener(){ numberSelected("1")}
        binding.button2.setOnClickListener(){ numberSelected("2")}
        binding.button3.setOnClickListener(){ numberSelected("3")}
        binding.button4.setOnClickListener(){ numberSelected("4")}
        binding.button5.setOnClickListener(){ numberSelected("5")}
        binding.button6.setOnClickListener(){ numberSelected("6")}
        binding.button7.setOnClickListener(){ numberSelected("7")}
        binding.button8.setOnClickListener(){ numberSelected("8")}
        binding.button9.setOnClickListener(){ numberSelected("9")}

        binding.buttonSum.setOnClickListener(){operationSelected(PLUS)}
        binding.buttonMinus.setOnClickListener(){operationSelected(MINUS)}
        binding.buttonMultiplication.setOnClickListener(){operationSelected(MULTIPLICATION)}
        binding.buttonDivision.setOnClickListener(){operationSelected(DIVISION)}

        binding.buttonBorrar.setOnClickListener(){
            binding.textViewResult.text = "0"
        }

    }

    private fun numberSelected(digito: String) {
            textViewResult.text = "${textViewResult.text}$digito"
    }
    private fun operationSelected(operation: Int){
        this.operation = operation

        num1 = textViewResult.text.toString().toDouble()

        textViewResult.text = "0"
    }

    companion object{
        const val PLUS = 1
        const val MINUS = 2
        const val MULTIPLICATION = 3
        const val DIVISION = 4

    }
}