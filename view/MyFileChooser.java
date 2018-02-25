package cn.edu.scau.cmi.linxiaoyi.comprehensive.view;

import java.io.File;

import javafx.stage.FileChooser;

/**
 * 
 * @author pinnuli
 */
public class MyFileChooser {

	public static File chooseFile() {
		File file = null;
		try {
			FileChooser fileChooser = new FileChooser();
			fileChooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("文本文件 (*.*.txt)", "*.txt"),
					new FileChooser.ExtensionFilter("二进制的对象文件 (*.*.dat)",
							"*.dat"));
						/*过滤选择文本文件和二进制文件*/
			file = fileChooser.showOpenDialog(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static File chooseSaveFile(String filename) {
		File file = null;
		try {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setInitialFileName(filename);
			fileChooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("文本文件 (*.*.txt)", "*.txt"),
					new FileChooser.ExtensionFilter("二进制的对象文件 (*.*.dat)",
							"*.dat"));
			file = fileChooser.showSaveDialog(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return file;
	}
}
