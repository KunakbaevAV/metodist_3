//import profstandart.Profstandart.XMLCardInfo.ProfessionalStandarts.ProfessionalStandart.ThirdSection.WorkFunctions.GeneralizedWorkFunctions.GeneralizedWorkFunction
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ListView
import javafx.scene.control.TextArea
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

    @FXML
    var purposeKindProfessionalActivity = TextArea()

    @FXML
    var listViewGWF = ListView<String>()

    @FXML
    var listViewWF = ListView<String>()


    fun readProfstandart() {
        val profstandart = ProfParser().parsing()
        profName.text = profstandart.xMLCardInfo!!.professionalStandarts!!.professionalStandart!!.nameProfessionalStandart
        purposeKindProfessionalActivity.text = profstandart.xMLCardInfo
                .professionalStandarts!!
                .professionalStandart!!
                .firstSection!!
                .purposeKindProfessionalActivity


        //создаю ObservableList из листа названий обобщенных ТФ
        val myNewList: ObservableList<String> = FXCollections.observableArrayList(profstandart
                .xMLCardInfo.professionalStandarts
                .professionalStandart!!.thirdSection!!.workFunctions!!.generalizedWorkFunctions!!.getNamesGWF())

        //запускаю список обобщенных ТФ на экран
        listViewGWF.items = myNewList

    }
}
