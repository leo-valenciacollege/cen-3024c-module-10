package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.ListView;

/**
 * 
 * MainSceneController class to create events to show the list of word occurrences and to clear the GUI 
 *
 */
public class MainSceneController {
	/**
	 * 
	 * analyzeBtn event listener
	 * 
	 */
	@FXML
	private Button analyzeBtn;
	/**
	 * 
	 * clearBtn event listener
	 * 
	 */
	@FXML
	private Button clearBtn;
	/**
	 * 
	 * resultView to view scene results
	 * 
	 */
	@FXML
	private ListView resultView;

	/**
	 * 
	 * analyzeWordsClick method
	 * 
	 * @param event for a click event to display word occurrences
	 */
	// Event Listener on Button[#analyzeBtn].onAction
	@FXML
	public void analyzeWordsClick(ActionEvent event) {
		// TODO Autogenerated
		WordOccurrence obj = new WordOccurrence();
		resultView.getItems().addAll(obj.getList());
	}
	
	/**
	 * 
	 * clearResult method
	 * 
	 * @param event for a click event to clear the JavaFX Stage GUI
	 */
	// Event Listener on Button[#clearBtn].onAction
	@FXML
	public void clearResult(ActionEvent event) {
		// TODO Autogenerated
		resultView.getItems().clear();
	}
}
