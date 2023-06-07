package com.abrorbek_uz.iyun7.utils

import com.abrorbek_uz.iyun7.models.Data



object MyData {
    val list = ArrayList<Data>()

    fun movieFun() {
        for (i in 0..50) {
            list.add(
                Data(
                    "Avengers",
                    "Views: 50k ",
                    "Release data: 16 Feb 2018"
                )
            )
            list.add(
                Data(
                    "Thor: Love and Thunder",
                    "Views: 80k ",
                    "Release data: 11 Apr 2019"
                )
            )
            list.add(
                Data(
                    "Spider-Man: For From-Home",
                    "Views: 20k ",
                    "Release data: 16 Feb 2022",

                )
            )
            list.add(
                Data(
                    "Iron Man 3",
                    "Views: 150k ",
                    "Release data: 01 Feb 2016"
                )
            )
            list.add(
                Data(
                    "Guardians of the Galaxy 2",
                    "Views: 55k ",
                    "Release data: 16 Mar 2022"
                )
            )
            list.add(
                Data(
                    "Doctor Strange",
                    "Views: 504k ",
                    "Release data: 16 Feb 2020"
                )
            )
            list.add(
                Data(
                    "Civil War: Capitan America",
                    "Views: 70k ",
                    "Release data: 16 Yan 2021"
                )
            )
            list.add(
                Data(
                    "Capitan America",
                    "Views: 105k ",
                    "Release data: 16 Feb 2022",
                )
            )
            list.add(
                Data(
                    "Capitan Marvel",
                    "Views: 257k ",
                    "Release data: 10 Sep 2018",

                )
            )
        }
    }
}