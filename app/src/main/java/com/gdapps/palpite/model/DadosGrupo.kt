package com.gdapps.palpite.model

class DadosGrupo{

    var faixaInicial: Int
    var faixaFinal: Int

    constructor(faixaInicial: Int, faixaFinal: Int){
        this.faixaInicial = faixaInicial
        this.faixaFinal = faixaFinal
    }

    companion object{
        fun getListaGrupo():List<String>{
            var listaGrupo = listOf(
                "0 - Todos",
                "1 - Avestruz",
                "2 - Águia",
                "3 - Burro",
                "4 - Borboleta",
                "5 - Cachorro",
                "6 - Cabra",
                "7 - Carneiro",
                "8 - Camelo",
                "9 - Cobra",
                "10 - Coelho",
                "11 - Cavalo",
                "12 - Elefante",
                "13 - Galo",
                "14 - Gato",
                "15 - Jacaré",
                "16 - Leão",
                "17 - Macaco",
                "18 - Porco",
                "19 - Pavão",
                "20 - Peru",
                "21 - Touro",
                "22 - Tigre",
                "23 - Urso",
                "24 - Veado",
                "25 - Vaca")
            return listaGrupo
        }
    }

    fun getCodigoGrupo(dezenaSorteada:Int):Int{

        val codigoGrupo = when(dezenaSorteada){
            1,2,3,4 -> 1
            5,6,7,8 -> 2
            9,10,11,12 -> 3
            13,14,15,16 -> 4
            17,18,19,20 -> 5
            21,22,23,24 -> 6
            25,26,27,28 -> 7
            29,30,31,32 -> 8
            33,34,35,36 -> 9
            37,38,39,40 -> 10
            41,42,43,44 -> 11
            45,46,47,48 -> 12
            49,50,51,52 -> 13
            53,54,55,56 -> 14
            57,58,59,60 -> 15
            61,62,63,64 -> 16
            65,66,67,68 -> 17
            69,70,71,72 -> 18
            73,74,75,76 -> 19
            77,78,79,80 -> 20
            81,82,83,84 -> 21
            85,86,87,88 -> 22
            89,90,91,92 -> 23
            93,94,95,96 -> 24
            97,98,99,0 -> 25
            else
            -> 0
        }
        return codigoGrupo
    }
    fun getNomeDoGrupo(codigoGrupo:Int):String{
        val nomeDoGrupo = when(codigoGrupo) {
            1 -> "Avestruz"
            2 -> "Águia"
            3 -> "Burro"
            4 -> "Borboleta"
            5 -> "Cachorro"
            6 -> "Cabra"
            7 -> "Carneiro"
            8 -> "Camelo"
            9 -> "Cobra"
            10 -> "Coelho"
            11 -> "Cavalo"
            12 -> "Elefante"
            13 -> "Galo"
            14 -> "Gato"
            15 -> "Jacaré"
            16 -> "Leão"
            17 -> "Macaco"
            18 -> "Porco"
            19 -> "Pavão"
            20 -> "Peru"
            21 -> "Touro"
            22 -> "Tigre"
            23 -> "Urso"
            24 -> "Veado"
            25 -> "Vaca"
            else -> "com.gdapps.palpite.model.Grupo não existe!"
        }
        return nomeDoGrupo
    }

    fun getListaCentenaViciadaDoGrupo(codigoGrupo:Int):List<Int>{

        val listaCentenaViciadaGrupo = when(codigoGrupo) {
            1 -> listOf(101,501,701,102,702,502,403,503,103,104,804,404)
            2 -> listOf(105,905,505,206,406,806,107,807,707,108,708,808)
            3 -> listOf(109,209,409,610,510,410,11,811,511,12,712,212)
            4 -> listOf(213,313,913,714,914,614,715,515,215,416,16,716)
            5 -> listOf(717,517,417,918,18,518,519,619,419,20,320,720)
            6 -> listOf(21,921,121,22,622,822,123,523,223,124,824,724)
            7 -> listOf(525,725,25,26,626,426,27,527,127,28,828,128)
            8 -> listOf(129,929,529,530,630,930,31,531,331,32,532,932)
            9 -> listOf(33,433,633,34,334,734,35,735,235,36,736,636)
            10 -> listOf(237,537,37,938,338,238,339,39,139,640,740,940)
            11 -> listOf(441,541,41,242,842,442,43,343,743,144,944,44)
            12 -> listOf(845,45,445,46,646,846,147,247,47,148,648,48)
            13 -> listOf(549,49,949,850,550,250,551,151,351,552,252,752)
            14 -> listOf(353,753,653,854,54,654,155,255,755,156,856,656)
            15 -> listOf(957,657,57,358,158,558,159,359,759,660,560,960)
            16 -> listOf(161,361,61,962,262,62,763,363,663,64,764,364)
            17 -> listOf(365,165,65,466,166,866,567,267,367,168,68,868)
            18 -> listOf(69,369,569,670,370,470,171,471,871,972,872,672)
            19 -> listOf(373,673,973,474,174,74,775,575,175,276,476,676)
            20 -> listOf(77,277,877,878,178,678,479,79,779,680,880,780)
            21 -> listOf(681,181,581,382,682,282,783,883,383,484,284,784)
            22 -> listOf(685,85,185,686,286,486,287,787,387,188,288,688)
            23 -> listOf(289,189,89,690,590,490,591,391,191,992,192,292)
            24 -> listOf(993,93,393,794,494,94,195,595,395,496,996,696)
            25 -> listOf(297,397,497,998,298,698,99,599,699,500,300,700)
            else -> listOf()
        }

        return listaCentenaViciadaGrupo

    }

    fun getNumeroRandomicoDezenaDeMilhar():Int{
        return (0..99999).random()
    }

    fun getNumeroRandomicoMilhar():Int{
        var retorno = (0..9999).random()
        return retorno
    }

    fun getNumeroRandomicofaixa(faixaInicial: Int, faixaFinal: Int):Int{
        var retorno = (faixaInicial..faixaFinal).random()
        return retorno
    }

    fun getNumeroRandomicoPorGrupo(codigoGrupo:Int): Grupo {

        var milharRandomica: String
        var centenaRandomica: Int
        var dezenaRandomica: Int
        var codigoGrupoRandomico: Int
        var numeroViciadoRandomico: Boolean

        if ( codigoGrupo.equals(0) ){
            milharRandomica = String.format(
                "%05d",
                getNumeroRandomicofaixa(this.faixaInicial, this.faixaFinal)
            )
            centenaRandomica =
                milharRandomica.subSequence(milharRandomica.length - 3, milharRandomica.length)
                    .toString().toInt()
            dezenaRandomica =
                milharRandomica.subSequence(milharRandomica.length - 2, milharRandomica.length)
                    .toString().toInt()
            codigoGrupoRandomico = getCodigoGrupo(dezenaRandomica.toString().toInt())
            numeroViciadoRandomico = getNumeroViciado(centenaRandomica)
        }else {
            do {
                milharRandomica = String.format(
                    "%05d",
                    getNumeroRandomicofaixa(this.faixaInicial, this.faixaFinal)
                )
                centenaRandomica =
                    milharRandomica.subSequence(milharRandomica.length - 3, milharRandomica.length)
                        .toString().toInt()
                dezenaRandomica =
                    milharRandomica.subSequence(milharRandomica.length - 2, milharRandomica.length)
                        .toString().toInt()
                codigoGrupoRandomico = getCodigoGrupo(dezenaRandomica.toString().toInt())
                numeroViciadoRandomico = getNumeroViciado(centenaRandomica)
            } while (codigoGrupoRandomico != codigoGrupo)
        }
        var grupo = Grupo(
            codigoGrupoRandomico,
            getNomeDoGrupo(codigoGrupoRandomico),
            milharRandomica.toInt(),
            centenaRandomica,
            dezenaRandomica,
            numeroViciadoRandomico,
            null
        )
        return grupo
    }

    fun getNumeroViciado(centena:Int):Boolean{

        val eUmNumeroViciado = when(centena) {
            1 -> ( centena in listOf(101,501,701,102,702,502,403,503,103,104,804,404) )
            2 -> ( centena in listOf(105,905,505,206,406,806,107,807,707,108,708,808) )
            3 -> ( centena in listOf(109,209,409,610,510,410,11,811,511,12,712,212) )
            4 -> ( centena in listOf(213,313,913,714,914,614,715,515,215,416,16,716) )
            5 -> ( centena in listOf(717,517,417,918,18,518,519,619,419,20,320,720) )
            6 -> ( centena in listOf(21,921,121,22,622,822,123,523,223,124,824,724) )
            7 -> ( centena in listOf(525,725,25,26,626,426,27,527,127,28,828,128) )
            8 -> ( centena in listOf(129,929,529,530,630,930,31,531,331,32,532,932) )
            9 -> ( centena in listOf(33,433,633,34,334,734,35,735,235,36,736,636) )
            10 -> ( centena in listOf(237,537,37,938,338,238,339,39,139,640,740,940) )
            11 -> ( centena in listOf(441,541,41,242,842,442,43,343,743,144,944,44) )
            12 -> ( centena in listOf(845,45,445,46,646,846,147,247,47,148,648,48) )
            13 -> ( centena in listOf(549,49,949,850,550,250,551,151,351,552,252,752) )
            14 -> ( centena in listOf(353,753,653,854,54,654,155,255,755,156,856,656) )
            15 -> ( centena in listOf(957,657,57,358,158,558,159,359,759,660,560,960) )
            16 -> ( centena in listOf(161,361,61,962,262,62,763,363,663,64,764,364) )
            17 -> ( centena in listOf(365,165,65,466,166,866,567,267,367,168,68,868) )
            18 -> ( centena in listOf(69,369,569,670,370,470,171,471,871,972,872,672) )
            19 -> ( centena in listOf(373,673,973,474,174,74,775,575,175,276,476,676) )
            20 -> ( centena in listOf(77,277,877,878,178,678,479,79,779,680,880,780) )
            21 -> ( centena in listOf(681,181,581,382,682,282,783,883,383,484,284,784) )
            22 -> ( centena in listOf(685,85,185,686,286,486,287,787,387,188,288,688) )
            23 -> ( centena in listOf(289,189,89,690,590,490,591,391,191,992,192,292) )
            24 -> ( centena in listOf(993,93,393,794,494,94,195,595,395,496,996,696) )
            25 -> ( centena in listOf(297,397,497,998,298,698,99,599,699,500,300,700) )
            else
               -> false
        }
        return eUmNumeroViciado
    }
}