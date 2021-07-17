fun main(args: Array<String>) {
    fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
        when {
            mood == "happy" && weather == "Sunny" -> "go for a walk"
            else -> "Stay home and read."
        }
    }
}

