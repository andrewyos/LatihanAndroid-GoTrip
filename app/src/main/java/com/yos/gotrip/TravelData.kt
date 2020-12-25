package com.yos.gotrip

object TravelData {

    private val pantaiName = arrayOf(
        "Pandawa Beach",
        "Klingking Beach",
        "Parangtritis Beach"
    )

    private val locPantai = arrayOf(
        "Pulau Bali",
        "Yogyakarta",
        "Yogyakarta"
    )

    private val pantaiImages = intArrayOf(
        R.drawable.pandawa,
        R.drawable.klingking,
        R.drawable.parangtritis
    )

    val listData: ArrayList<Pantai>
        get() {
            val list = arrayListOf<Pantai>()
            for (position in pantaiName.indices) {
                val pantai = Pantai()
                pantai.name = pantaiName[position]
                pantai.img = pantaiImages[position]
                pantai.loc = locPantai[position]
                list.add(pantai)
            }
            return list
        }

}