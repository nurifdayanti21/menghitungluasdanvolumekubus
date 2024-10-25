package id.ac.polbeng.nurifdayanti.menghitungluasdanvolumekubus

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import id.ac.polbeng.nurifdayanti.menghitungluasdanvolumekubus.databinding.ActivityMainBinding;


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHitung.setOnClickListener {
            val sisi = binding.editTextNumber1.text.toString().toDoubleOrNull()


            if (sisi == null) {
                binding.editTextNumber1.error = "Please enter a valid number"

            } else {
                val luas = 6 * (sisi * sisi)
                val volume = sisi * sisi * sisi

                binding.resultTextView.text = "Luas permukaannya: $luas\nVolumenya: $volume"

            }
        }
    }
}