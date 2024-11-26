package com.example.agenda1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda1.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências aos componentes do layout
        val etNome = findViewById<EditText>(R.id.etNome)
        val etFone = findViewById<EditText>(R.id.etFone)
        val etEndereco = findViewById<EditText>(R.id.etEndereco)
        val etCidade = findViewById<EditText>(R.id.etCidade)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Ação ao clicar no botão
        btnSubmit.setOnClickListener {
            // Captura os dados dos EditTexts
            val nome = etNome.text.toString()
            val fone = etFone.text.toString()
            val endereco = etEndereco.text.toString()
            val cidade = etCidade.text.toString()

            // Cria o texto para o resultado
            val resultado = """
                Nome: $nome
                Telefone: $fone
                Endereço: $endereco
                Cidade: $cidade
            """.trimIndent()

            // Atribui o texto ao TextView
            tvResult.text = resultado
        }
    }
}
