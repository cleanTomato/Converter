package org.example

fun main() {
    println("Добро пожаловать в конвертер величин!")
    while (true) {
        // Выбор системы мер
        println("Выберите систему мер:")
        println("1. Американская система")
        println("2. Старорусская система")
        println("3. Международная система единиц (СИ)")

        val inputSystem = readLine()?.toIntOrNull() ?: -1
        if (inputSystem !in 1..3) {
            println("Неверный выбор системы мер. Попробуйте снова.")
            continue
        }

        // Выбор единицы измерения
        println("Выберите единицу измерения:")
        when (inputSystem) {
            1 -> {
                println("1. Дюйм")
                println("2. Фут")
                println("3. Ярд")
                println("4. Миля")
            }
            2 -> {
                println("1. Вершок")
                println("2. Аршин")
                println("3. Сажень")
                println("4. Верста")
            }
            3 -> {
                println("1. Миллиметр")
                println("2. Сантиметр")
                println("3. Метр")
                println("4. Километр")
            }
        }

        val inputUnit = readLine()?.toIntOrNull() ?: -1
        if (inputUnit !in 1..4) {
            println("Неверный выбор единицы измерения. Попробуйте снова.")
            continue
        }

        // Ввод значения для конвертации
        println("Введите значение:")
        val inputValue = readLine()?.toDoubleOrNull() ?: 0.0

        // Конвертация значения
        val outputValue = convertValue(inputSystem, inputUnit, inputValue)
        if (inputSystem == 1 || inputSystem == 2) {
            println("Результат: $outputValue мм")
        } else {
            println("Результат: $outputValue м")
        }

        // Запрос на повторную конвертацию
        println("Хотите конвертировать другую величину? (да/нет)")
        if (readLine()?.toLowerCase() != "да") break
    }
}

fun convertValue(inputSystem: Int, inputUnit: Int, inputValue: Double): Double {
    return when (inputSystem to inputUnit) {
        1 to 1 -> inputValue * 25.4 // дюйм в миллиметры
        1 to 2 -> inputValue * 304.8 // фут в миллиметры
        1 to 3 -> inputValue * 914.4 // ярд в миллиметры
        1 to 4 -> inputValue * 1609344.0 // миля в миллиметры
        2 to 1 -> inputValue * 44.45 // вершок в миллиметры
        2 to 2 -> inputValue * 711.2 // аршин в миллиметры
        2 to 3 -> inputValue * 2133.6 // сажень в миллиметры
        2 to 4 -> inputValue * 1066800.0 // верста в миллиметры
        3 to 1 -> inputValue / 1000.0 // миллиметры в СИ
        3 to 2 -> inputValue / 100.0 // сантиметры в СИ
        3 to 3 -> inputValue * 1.0 // метры в СИ
        3 to 4 -> inputValue * 1000.0 // километры в СИ
        else -> 0.0
    }
}


