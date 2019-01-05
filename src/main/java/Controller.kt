import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import profstandart.ProfParser

/**
 * @autor Kunakbaev Artem
 */
class Controller {
    @FXML
    val buttonDownload = Button()

    @FXML
    var profName = TextField()

    fun readProfstandart() {
        val profstandart = ProfParser().parsing()
        profName.text = profstandart.xMLCardInfo!!.professionalStandarts!!.professionalStandart!!.nameProfessionalStandart
    }


}
