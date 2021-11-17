package com.gdapps.palpite

import com.gdapps.palpite.model.DadosGrupo
import com.gdapps.palpite.model.Grupo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible
import com.gdapps.palpite.util.Mensagens
import android.view.View
import com.gdapps.palpite.R.layout.*
import com.gdapps.palpite.enums.EnumVisaoLayout


class MainActivity : AppCompatActivity() {

    var spinnerGrupoId: Int = -1
    private lateinit var spinnerGrupo: Spinner
    private lateinit var editFaixaInicial: EditText
    private lateinit var editFaixaFinal: EditText
    private lateinit var editNumeroGerado: EditText
    private lateinit var editMensagem: TextView
    private lateinit var editNomeGrupo: TextView
    private lateinit var textViewSelGrupo: TextView
    private lateinit var buttonGerarNumero: Button
    private lateinit var buttonLimpar: Button
    private lateinit var numeroRandomicoGrupo: Grupo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        identificarComponentes()
        ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.INICIAL)

        buttonGerarNumero.setOnClickListener {
            gerarNumeroClick()
        }
        buttonLimpar.setOnClickListener{
            ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.INICIAL)
        }
    }

    private fun gerarNumeroClick() {
        if ( formularioValido() ) {
            try {
                val dadosGrupo = DadosGrupo(editFaixaInicial.text.toString().toInt(),editFaixaFinal.text.toString().toInt())
                numeroRandomicoGrupo = dadosGrupo.getNumeroRandomicoPorGrupo(spinnerGrupoId)
                editMensagem.text = Mensagens.MSG_NUMERO_SORTE
                editNomeGrupo.text = numeroRandomicoGrupo.codigo.toString().plus(" - "+numeroRandomicoGrupo.nome)
                editNumeroGerado.setText(numeroRandomicoGrupo.milhar.toString())
                ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.GERAR_NUMERO)
            }catch (e:Exception){
                ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.ERRO, e.message.toString())
            }
        }
    }

    private fun ajustarVisaoDosComponentesNoLayout(visaoLayout: EnumVisaoLayout,
                                                   msgErro: String = "") {
        when(visaoLayout){
            EnumVisaoLayout.INICIAL -> {
                carregarSpinnerGrupo(DadosGrupo.getListaGrupo())
                textViewSelGrupo.isVisible = true
                spinnerGrupo.isVisible = true
                editFaixaInicial.isVisible = true
                editFaixaFinal.isVisible = true
                editMensagem.isVisible = false
                editNomeGrupo.isVisible = false
                editNumeroGerado.isVisible = false
                buttonGerarNumero.isVisible = true
                buttonLimpar.isVisible = false
                spinnerGrupo.setSelection(0)
                editFaixaInicial.setText("00000")
                editFaixaFinal.setText("99999")
                editMensagem.text = ""
                editNomeGrupo.text = ""
                editNumeroGerado.setText("")
            }
            EnumVisaoLayout.GERAR_NUMERO -> {
                textViewSelGrupo.isVisible = false
                spinnerGrupo.isVisible = false
                editFaixaInicial.isVisible = false
                editFaixaFinal.isVisible = false
                editMensagem.isVisible = true
                editNomeGrupo.isVisible = true
                editNumeroGerado.isVisible = true
                buttonGerarNumero.isVisible = false
                buttonLimpar.isVisible = true
            }
            EnumVisaoLayout.GRUPO_SELECIONADO -> {
                textViewSelGrupo.isVisible = true
                spinnerGrupo.isVisible = true
                editFaixaInicial.isVisible = false
                editFaixaFinal.isVisible = false
                editMensagem.isVisible = false
                editNomeGrupo.isVisible = false
                editNumeroGerado.isVisible = false
                buttonGerarNumero.isVisible = true
                buttonLimpar.isVisible = false
                editFaixaInicial.setText("00000")
                editFaixaFinal.setText("99999")
                editMensagem.text = ""
                editNomeGrupo.text = ""
                editNumeroGerado.setText("")
            }
            EnumVisaoLayout.TODOS_GRUPOS -> {
                textViewSelGrupo.isVisible = true
                spinnerGrupo.isVisible = true
                editFaixaInicial.isVisible = true
                editFaixaFinal.isVisible = true
                editMensagem.isVisible = false
                editNomeGrupo.isVisible = false
                editNumeroGerado.isVisible = false
                buttonGerarNumero.isVisible = true
                buttonLimpar.isVisible = false
                editMensagem.text = ""
                editNomeGrupo.text = ""
                editNumeroGerado.setText("")
            }
            EnumVisaoLayout.ERRO -> {
                editMensagem.isVisible = true
                editNomeGrupo.isVisible = false
                editNumeroGerado.isVisible = false
                buttonLimpar.isVisible = true
                editNomeGrupo.text = ""
                editNumeroGerado.setText("")
                editMensagem.text = msgErro
            }
        }
    }

    private fun identificarComponentes() {
        spinnerGrupo      = findViewById(R.id.spnTest)
        editFaixaInicial  = findViewById(R.id.editTextNumberFaixaInicial)
        editFaixaFinal    = findViewById(R.id.editTextNumberFaixaFinal)
        editMensagem      = findViewById(R.id.textViewMensagem)
        editNomeGrupo     = findViewById(R.id.textViewNomeGrupo)
        textViewSelGrupo  = findViewById(R.id.textViewSelGrupo)
        editNumeroGerado  = findViewById(R.id.editTextNumberNumeroGerado)
        buttonGerarNumero = findViewById(R.id.buttonGerarNumero)
        buttonLimpar      = findViewById(R.id.buttonLimpar)
    }

    private fun carregarSpinnerGrupo(lista:List<String>) {
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, support_simple_spinner_dropdown_item, lista)
        spinnerGrupo.adapter = arrayAdapter
        spinnerGrupo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                spinnerGrupoId = p2
                if (p2 > 0){
                    ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.GRUPO_SELECIONADO)
                }else{
                    ajustarVisaoDosComponentesNoLayout(EnumVisaoLayout.TODOS_GRUPOS)
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}
        }

        spinnerGrupo.alturaLimiteDropDown()
    }

    fun Spinner.alturaLimiteDropDown() {
        try {
            val listPopup = Spinner::class.java
                .getDeclaredField("mPopup")
                .apply { isAccessible = true }
                .get(this)
            if (listPopup is ListPopupWindow) {
                val popup = ListPopupWindow::class.java
                    .getDeclaredField("mPopup")
                    .apply { isAccessible = true }
                    .get(listPopup)
                if (popup is PopupWindow) {
                    popup.isFocusable = false
                    popup.height = 1
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun formularioValido():Boolean{
        var eValido = true
        val faixaInicial = editFaixaInicial.text
        val faixaFinal = editFaixaFinal.text

        limpaMsgErro()
        if ( spinnerGrupoId < 0 ){
            Toast.makeText(this, Mensagens.MSG_GRUPO_NAO_SELECIONADO, Toast.LENGTH_LONG).show()
            eValido = false
        }
        if ( (faixaInicial.isNullOrBlank()) || (faixaInicial.isNullOrEmpty()) ){
            editFaixaInicial.error = Mensagens.MSG_INFORME_FAIXA_INICIAL
            eValido = false
        }else if ( (faixaFinal.isNullOrBlank()) || (faixaFinal.isNullOrEmpty()) ){
            editFaixaFinal.error = Mensagens.MSG_INFORME_FAIXA_FINAL
            eValido = false
        }else if ((faixaInicial.toString().toInt()) > (faixaFinal.toString().toInt())){
            editFaixaFinal.error = Mensagens.MSG_FAIXA_NAO_PERMITIDA
            eValido = false
        }
        return eValido
    }

    private fun limpaMsgErro(){
        editFaixaInicial.error = null
        editFaixaFinal.error = null
    }
}