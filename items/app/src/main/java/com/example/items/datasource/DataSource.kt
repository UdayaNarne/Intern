package com.example.items.datasource
import com.example.items.R
import com.example.items.model.menu.EntreeItem
object DataSource {
    val entreeMenuItems = listOf(
        EntreeItem(name = "Dorameon", imageResId = R.drawable.doramon, price = 7.00, description = "Doraemon was created by the manga duo Fujiko F. Fujio, consisting of Hiroshi Fujimoto (Fujiko F. Fujio) and Motoo Abiko (Fujiko Fujio A). The manga first appeared in December 1969."),
        EntreeItem(
            name = "Teddy Bear",
            imageResId = R.drawable.teddy,
            price = 4.00,
            description = "The teddy bear's name is derived from President Theodore Roosevelt, whose nickname was Teddy. The term \"teddy bear\" became popular after a cartoon depicted Roosevelt refusing to shoot a bear cub during a hunting trip in 1902."
        ),
        EntreeItem(
            name = "Barbie",
            imageResId = R.drawable.barbie,
            price = 5.50,
            description = "Barbie was created by Ruth Handler, co-founder of Mattel, Inc., and named after her daughter Barbara. The first Barbie doll made its debut at the American International Toy Fair in New York on March 9, 1959."
        ),
        EntreeItem(
            name = "Tom and Jerry",
            imageResId = R.drawable.tomjerry,
            price = 5.50,
            description = "The first Tom and Jerry cartoon, titled \"Puss Gets the Boot,\" was released on February 10, 1940. However, the characters were initially named Jasper and Jinx until they were officially named Tom and Jerry in subsequent episodes."
        )
    )
}
