package postulante.scesi.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val boton0 = findViewById<Button>(R.id.boton_0)
        val boton1 = findViewById<Button>(R.id.boton_1)
        val boton2 = findViewById<Button>(R.id.boton_2)
        val boton3 = findViewById<Button>(R.id.boton_3)
        val boton4 = findViewById<Button>(R.id.boton_4)
        val boton5 = findViewById<Button>(R.id.boton_5)
        val boton6 = findViewById<Button>(R.id.boton_6)
        val boton7 = findViewById<Button>(R.id.boton_7)
        val boton8 = findViewById<Button>(R.id.boton_8)
        val boton9 = findViewById<Button>(R.id.boton_9)
        val botonPunto = findViewById<Button>(R.id.boton_punto)
        val botonSumar = findViewById<Button>(R.id.boton_suma)
        val botonRestar = findViewById<Button>(R.id.boton_resta)
        val botonMultiplicar = findViewById<Button>(R.id.boton_multiplicacion)
        val botonDividir = findViewById<Button>(R.id.boton_divicion)
        val botonBorrar = findViewById<Button>(R.id.boton_del)
        val botonIgual = findViewById<Button>(R.id.boton_igual)
        val textoResultado = findViewById<TextView>(R.id.texto_resultado)
        val textoEntrada = findViewById<TextView>(R.id.texto_entrada)
        var resultado = 0

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        boton0.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}0"
        }

        boton1.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}1"
        }

        boton2.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}2"
        }

        boton3.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}3"
        }

        boton4.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}4"
        }

        boton5.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}5"
        }

        boton6.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}6"
        }

        boton7.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}7"
        }

        boton8.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}8"
        }

        boton9.setOnClickListener {
            textoEntrada.text = "${textoEntrada.text}9"
        }

        botonSumar.setOnClickListener {
            resultado = resultado + textoEntrada.text.toString().toInt()
            textoEntrada.text = ""
            textoResultado.text = "$resultado"
        }

        botonRestar.setOnClickListener {
            resultado = resultado - textoEntrada.text.toString().toInt()
            textoEntrada.text = ""
            textoResultado.text = "$resultado"
        }

        botonMultiplicar.setOnClickListener {
            resultado = resultado * textoEntrada.text.toString().toInt()
            textoEntrada.text = ""
            textoResultado.text = "$resultado"
        }

        botonDividir.setOnClickListener {
            if (resultado != 0 || textoEntrada.text.toString().toInt() != 0) {
                resultado = resultado / textoEntrada.text.toString().toInt()
                textoEntrada.text = ""
                textoResultado.text = "$resultado"
            } else {
                textoEntrada.text = "No se puede dividir por 0"
                textoResultado.text = "ERROR"
            }
        }

        botonBorrar.setOnClickListener {
            textoEntrada.text = ""
            textoResultado.text = ""
            resultado = 0
        }

        botonIgual.setOnClickListener {
            textoResultado.text = "$resultado"
        }
    }
}