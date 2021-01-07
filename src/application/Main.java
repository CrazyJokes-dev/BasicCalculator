package application;
	
import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	private double result = 0;
	private double num1;
	private double num2;
	private String whichOperator;
	private boolean operatorPressed = false;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			
				//Beginning of Numbered Buttons
			Button one = new Button("1");
			one.setMinSize(78, 55);
			
			Button two = new Button("2");
			two.setMinSize(78, 55);
			
			Button three = new Button("3");
			three.setMinSize(78, 55);
			
			Button four = new Button("4");
			four.setMinSize(78, 55);
			
			Button five = new Button("5");
			five.setMinSize(78, 55);
			
			Button six = new Button("6");
			six.setMinSize(78, 55);
			
			Button seven = new Button("7");
			seven.setMinSize(78, 55);
			
			Button eight = new Button("8");
			eight.setMinSize(78, 55);
			
			Button nine = new Button("9");
			nine.setMinSize(78, 55);
			
			Button zero = new Button("0");
			zero.setMinSize(78, 55);
				//End of Numbered Buttons
			
			////////////////////////////////////////
			
				//Start of Math Buttons
			Button addition = new Button("+");
			addition.setMinSize(78, 55);
			
			Button multiply = new Button("X");
			multiply.setMinSize(78, 55);
			
			Button subtract = new Button("-");
			subtract.setMinSize(78, 55);
			
			Button divide = new Button("/");
			divide.setMinSize(78, 55);
			
			Button decimal = new Button(".");
			decimal.setMinSize(78, 55);
			
			Button negativeSign = new Button("+/-");
			negativeSign.setMinSize(78, 55);
			
			Button equalSign = new Button("=");
			equalSign.setMinSize(78, 55);
				//End of Math Buttons
			
			
			////////////////////////////////////////
			
			
			//START OF BUTTONGRID
			GridPane buttonGrid = new GridPane();
			
				//Adding the buttons to the GridPane
			//Row 1
			buttonGrid.add(divide, 3, 0);
			
			//Row 2
			buttonGrid.add(one, 0, 1);
			buttonGrid.add(two, 1, 1);
			buttonGrid.add(three, 2, 1);
			buttonGrid.add(multiply, 3, 1);
			
			//Row 3
			buttonGrid.add(four, 0, 2);
			buttonGrid.add(five, 1, 2);
			buttonGrid.add(six, 2, 2);
			buttonGrid.add(subtract, 3, 2);
			
			//Row 4
			buttonGrid.add(seven, 0, 3);
			buttonGrid.add(eight, 1, 3);
			buttonGrid.add(nine, 2, 3);
			buttonGrid.add(addition, 3, 3);
			
			//Row 5
			buttonGrid.add(negativeSign, 0, 4);
			buttonGrid.add(zero, 1, 4);
			buttonGrid.add(decimal, 2, 4);
			buttonGrid.add(equalSign, 3, 4);
			
			
				//Editing the spacing and positioning of the button grid
			buttonGrid.setHgap(1);
			buttonGrid.setVgap(1);
			//buttonGrid.setPadding(new Insets(3));
			buttonGrid.setAlignment(Pos.BOTTOM_LEFT);
			//END OF BUTTONGRID
			
			//START OF TEXTFIELD
			TextField input = new TextField("0");
			input.setId("input-textField");
			input.setMaxSize(318, 100);
			input.setAlignment(Pos.TOP_RIGHT);
			input.setEditable(false);
			//END OF TEXTFIELD
			
			////////////////////////  Working on the calculator actually doing math
			
			//INDIVIDUAL BUTTON EVENTS GO HERE
			
			
			
			one.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 1;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 1;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			two.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 2;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 2;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			three.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 3;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 3;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			four.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 4;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 4;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			five.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 5;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 5;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			six.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 6;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 6;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			seven.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 7;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 7;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			eight.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 8;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 8;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			nine.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 9;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 9;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			zero.setOnAction(value1 -> {
				if(operatorPressed == false) {
					num1 = 0;
					input.setText(Integer.toString((int)num1));
				} else {
					num2 = 0;
					if(whichOperator == "/") {
						input.setText(Double.toString(doMath(num1, num2)));
					} else {
						input.setText(Integer.toString((int)doMath(num1, num2)));
					}
					operatorPressed = false;
				}
			});
			
			addition.setOnAction(value1 -> {
				whichOperator = "+";
				operatorPressed = true;
			});
			
			subtract.setOnAction(value1 -> {
				whichOperator = "-";
				operatorPressed = true;
			});
			
			multiply.setOnAction(value1 -> {
				whichOperator = "*";
				operatorPressed = true;
			});
			
			divide.setOnAction(value1 -> {
				whichOperator = "/";
				operatorPressed = true;
			});
			
			
			//END OF BUTTON EVENTS
			
			root.setPadding(new Insets(3));
			root.setBottom(buttonGrid);
			root.setTop(input);
			
			Scene scene = new Scene(root, 321, 500);
			primaryStage.setTitle("Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public double doMath(double num1, double num2) {
		if(whichOperator == "+") {
			result = num1 + num2;
			num1 = result;
			
		}else if(whichOperator == "-") {
			result = num1 - num2;
			num1 = result;
			
		}else if(whichOperator == "*") {
			result = num1 * num2;
			num1 = result;
			
		}else if(whichOperator == "/") {
			result = num1 / num2;
			num1 = result;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
