package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.media.AudioClip;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

@SuppressWarnings("deprecation")
public class Controller extends Region implements Initializable {
	String path1, path2, path3, path4, path5, path6, path7, path8, path9;
	String blank = "images/blank.jpg";
	String pathbgm = "/gekitei.mp3", pathup = "/up.wav";
	URL bgm = getClass().getResource(pathbgm), movesnd = getClass().getResource(pathup);
	AudioClip gekitei = new AudioClip(bgm.toString()), up = new AudioClip(movesnd.toString());
	int count = 0, picid, countclick = 1;
	Image change1 = new Image(blank),win=new Image("images/win.png"),lose=new Image("images/lose.png");
	@FXML
	ImageView icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9;
	@FXML
	Label move;
	@FXML
	AnchorPane ap;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//ap.setStyle("-fx-background:transparent;");
		gekitei.play();
		gekitei.setCycleCount(AudioClip.INDEFINITE);
		// System.out.println(gekitei.cycleCountProperty());
	}

	public void move1(MouseEvent event) {
		if (!icon1.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon1.getImage();
			if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon2.setImage(temp);
				icon1.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon4.setImage(temp);
				icon1.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {
		}
	}

	public void move2(MouseEvent event) {
		if (!icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon2.getImage();
			// icon2.setImage(change1);
			if (icon1.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon1.setImage(temp);
				icon2.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon3.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon3.setImage(temp);
				icon2.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon5.setImage(temp);
				icon2.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move3(MouseEvent event) {
		if (!icon3.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon3.getImage();
			if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon2.setImage(temp);
				icon3.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon6.setImage(temp);
				icon3.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {
		}
	}

	public void move4(MouseEvent event) {
		if (!icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon4.getImage();
			if (icon1.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon1.setImage(temp);
				icon4.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon7.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon7.setImage(temp);
				icon4.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon5.setImage(temp);
				icon4.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move6(MouseEvent event) {
		if (!icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon6.getImage();
			if (icon9.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon9.setImage(temp);
				icon6.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon3.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon3.setImage(temp);
				icon6.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon5.setImage(temp);
				icon6.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move7(MouseEvent event) {
		if (!icon7.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon7.getImage();
			if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon8.setImage(temp);
				icon7.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon4.setImage(temp);
				icon7.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move8(MouseEvent event) {
		if (!icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon8.getImage();
			if (icon9.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon9.setImage(temp);
				icon8.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon7.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon7.setImage(temp);
				icon8.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon5.setImage(temp);
				icon8.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move9(MouseEvent event) {
		if (!icon9.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon9.getImage();
			if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon8.setImage(temp);
				icon9.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon6.setImage(temp);
				icon9.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {

		}
	}

	public void move5(MouseEvent event) {
		if (!icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			Image temp = icon5.getImage();
			if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon2.setImage(temp);
				icon5.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon4.setImage(temp);
				icon5.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon6.setImage(temp);
				icon5.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			} else if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
				icon8.setImage(temp);
				icon5.setImage(change1);
				count += 1;
				move.setText("回合數:" + Integer.toString(count));
				up.play();
				lose();
				win();
			}
		} else {
		}
	}

	public void up() {
		if (icon1.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move4(null);
		} else if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move5(null);
		} else if (icon3.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move6(null);
		} else if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move7(null);
		} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move8(null);
		} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move9(null);
		}
	}

	public void down() {
		if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move1(null);
		} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move2(null);
		} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move3(null);
		} else if (icon7.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move4(null);
		} else if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move5(null);
		} else if (icon9.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move6(null);
		}
	}

	public void left() {
		if (icon1.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move2(null);
		} else if (icon4.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move5(null);
		} else if (icon7.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move8(null);
		} else if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move3(null);
		} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move6(null);
		} else if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move9(null);
		}
	}

	public void right() {
		if (icon2.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move1(null);
		} else if (icon5.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move4(null);
		} else if (icon8.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move7(null);
		} else if (icon3.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move2(null);
		} else if (icon6.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move5(null);
		} else if (icon9.getImage().impl_getUrl().equals(change1.impl_getUrl())) {
			move8(null);
		}
	}

	public void keyup(KeyEvent Event) {
		if (Event.getCode() == KeyCode.UP) {
			up();
		}
	}

	public void keydown(KeyEvent Event) {
		if (Event.getCode() == KeyCode.DOWN) {
			down();
		}
	}

	public void keyleft(KeyEvent Event) {
		if (Event.getCode() == KeyCode.LEFT) {
			left();
		}
	}

	public void keyright(KeyEvent Event) {
		if (Event.getCode() == KeyCode.RIGHT) {
			right();
		}
	}

	public void keystart(KeyEvent Event) {

	}

	public void keymove(KeyEvent Event) {
		keyup(Event);
		keydown(Event);
		keyleft(Event);
		keyright(Event);
		if (Event.getCode() == KeyCode.ENTER) {
			start(null);
		}
		if (Event.getCode() == KeyCode.M) {
			play(null);
		}
		if (Event.getCode() == KeyCode.ESCAPE) {
			//exit(null);
			Platform.exit();
		}
	}

	public void padup(ActionEvent e) {
		up();
	}

	public void paddown(ActionEvent e) {
		down();
	}

	public void padleft(ActionEvent e) {
		left();
	}

	public void padright(ActionEvent e) {
		right();
	}

	public void exit(ActionEvent event) {
		//System.exit(0);
		Platform.exit();
	}

	public void start(ActionEvent event) {
		int a;
		change();
		count = 0;
		move.setText("回合數:" + Integer.toString(count));
		Image[] block = new Image[9];
		String[] path = { path1, path2, path3, path4, path5, path6, path7, path8, path9 };
		for (int i = 0; i < 9; i++) {
			block[i] = new Image(path[i]);
		}
		List<Image> list = new ArrayList<Image>();
		// List<Image> list=Arrays.asList(block);
		for (int i = 0; i < block.length; i++) {
			list.add(block[i]);
		}
		Random random = new Random();
		int n;
		int[]m=new int[9];
		ImageView[] icon = { icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9 };
		for (int i = 9; i > 0; i--) {
			n = random.nextInt(i);
			m[9-i]=n;
			icon[9 - i].setImage(block[n]);
			if (i != 1) {
				list.remove(n);
				block = list.toArray(new Image[1]);
			}
		}
		for(int i=0;i<9;i++){
			System.out.println("m"+i+"="+m[i]);	
		}
		for(int k=0;k<9;k++){
			if(icon[k].getImage().impl_getUrl().equals(change1.impl_getUrl())){
				a=k+1;
				//System.out.println(a);
				
				//if(a%2==0){}
				int jiou=0;
				for(int i=0;i<8;i++)
				{
				for(int j=i+1;j<9;j++){
				if(m[i]>m[j]){
				jiou+=1;
				}
				}
				}
				//System.out.println(jiou);
				if((jiou%2==0&&a%2==0)||(jiou%2!=0&&a%2!=0)){
					//System.out.println("aaa");
					//start(null);
				}
			}
		}
		
	}

	public void change() {
		int x = (int) (Math.random() * 9);
		picid = x;
		switch (x) {
		case 0:
			path1 = "images/sakura_01.jpg";
			path2 = "images/sakura_02.jpg";
			path3 = "images/blank.jpg";
			path4 = "images/sakura_04.jpg";
			path5 = "images/sakura_05.jpg";
			path6 = "images/sakura_06.jpg";
			path7 = "images/sakura_07.jpg";
			path8 = "images/sakura_08.jpg";
			path9 = "images/sakura_09.jpg";
			// start(event);
			break;
		case 1:
			path1 = "images/blank.jpg";
			path2 = "images/Puchi-Sakura_02.jpg";
			path3 = "images/Puchi-Sakura_03.jpg";
			path4 = "images/Puchi-Sakura_04.jpg";
			path5 = "images/Puchi-Sakura_05.jpg";
			path6 = "images/Puchi-Sakura_06.jpg";
			path7 = "images/Puchi-Sakura_07.jpg";
			path8 = "images/Puchi-Sakura_08.jpg";
			path9 = "images/Puchi-Sakura_09.jpg";
			break;
		case 2:
			path1 = "images/cherry_01.jpg";
			path2 = "images/cherry_02.jpg";
			path3 = "images/blank.jpg";
			path4 = "images/cherry_04.jpg";
			path5 = "images/cherry_05.jpg";
			path6 = "images/cherry_06.jpg";
			path7 = "images/cherry_07.jpg";
			path8 = "images/cherry_08.jpg";
			path9 = "images/cherry_09.jpg";
			break;
		case 3:
			path1 = "images/lum_01.jpg";
			path2 = "images/lum_02.jpg";
			path3 = "images/lum_03.jpg";
			path4 = "images/lum_04.jpg";
			path5 = "images/lum_05.jpg";
			path6 = "images/lum_06.jpg";
			path7 = "images/blank.jpg";
			path8 = "images/lum_08.jpg";
			path9 = "images/lum_09.jpg";
			break;
		case 4:
			path1 = "images/glance_01.jpg";
			path2 = "images/glance_02.jpg";
			path3 = "images/blank.jpg";
			path4 = "images/glance_04.jpg";
			path5 = "images/glance_05.jpg";
			path6 = "images/glance_06.jpg";
			path7 = "images/glance_07.jpg";
			path8 = "images/glance_08.jpg";
			path9 = "images/glance_09.jpg";
			break;
		case 5:
			path1 = "images/romance_01.jpg";
			path2 = "images/romance_02.jpg";
			path3 = "images/romance_03.jpg";
			path4 = "images/romance_04.jpg";
			path5 = "images/romance_05.jpg";
			path6 = "images/romance_06.jpg";
			path7 = "images/blank.jpg";
			path8 = "images/romance_08.jpg";
			path9 = "images/romance_09.jpg";
			break;
		case 6:
			path1 = "images/kaze_01.jpg";
			path2 = "images/kaze_02.jpg";
			path3 = "images/blank.jpg";
			path4 = "images/kaze_04.jpg";
			path5 = "images/kaze_05.jpg";
			path6 = "images/kaze_06.jpg";
			path7 = "images/kaze_07.jpg";
			path8 = "images/kaze_08.jpg";
			path9 = "images/kaze_09.jpg";
			break;
		case 7:
			path1 = "images/wind_01.jpg";
			path2 = "images/wind_02.jpg";
			path3 = "images/blank.jpg";
			path4 = "images/wind_04.jpg";
			path5 = "images/wind_05.jpg";
			path6 = "images/wind_06.jpg";
			path7 = "images/wind_07.jpg";
			path8 = "images/wind_08.jpg";
			path9 = "images/wind_09.jpg";
			break;
		case 8:
			path1 = "images/blank.jpg";
			path2 = "images/battle_02.jpg";
			path3 = "images/battle_03.jpg";
			path4 = "images/battle_04.jpg";
			path5 = "images/battle_05.jpg";
			path6 = "images/battle_06.jpg";
			path7 = "images/battle_07.jpg";
			path8 = "images/battle_08.jpg";
			path9 = "images/battle_09.jpg";
			break;
		}

	}

	public void win() {
		int complete = 0;

		Image[] pic = new Image[9];
		ImageView[] icon = { icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9 };
		String[] path = { path1, path2, path3, path4, path5, path6, path7, path8, path9 };

		for (int i = 0; i < 9; i++) {
			pic[i] = new Image(path[i]);
		}
		for (int i = 0; i < 9; i++) {
			if (pic[i].impl_getUrl().equals(icon[i].getImage().impl_getUrl())) {
				complete += 1;
			}
		}

		if (complete == 9) {
			switch (picid) {
			case 0:
				path3 = "images/sakura_03.jpg";
				icon3.setImage(new Image(path3));
				break;
			case 1:
				path1 = "images/Puchi-Sakura_01.jpg";
				icon1.setImage(new Image(path1));
				break;
			case 2:
				path3 = "images/cherry_03.jpg";
				icon3.setImage(new Image(path3));
				break;
			case 3:
				path7 = "images/lum_07.jpg";
				icon7.setImage(new Image(path7));
				break;
			case 4:
				path3 = "images/glance_03.jpg";
				icon3.setImage(new Image(path3));
				break;
			case 5:
				path7 = "images/romance_07.jpg";
				icon7.setImage(new Image(path7));
				break;
			case 6:
				path3 = "images/kaze_03.jpg";
				icon3.setImage(new Image(path3));
				break;
			case 7:
				path3 = "images/wind_03.jpg";
				icon3.setImage(new Image(path3));
				break;
			case 8:
				path1 = "images/battle_01.jpg";
				icon1.setImage(new Image(path1));
				break;
			}
			// gekitei.setCycleCount(AudioClip.INDEFINITE);
			if(gekitei.isPlaying()){
				gekitei.stop();
			}
			gekitei.play();
			Alert finish = new Alert(AlertType.INFORMATION);
			finish.setTitle("恭喜完成拼圖， 移動回合數" + count + "次");
			finish.setContentText("SEGA大法好!\n"+"さくら最高!");
			finish.setHeaderText(null);
			finish.setGraphic(new ImageView(win));
			finish.showAndWait();
			count = 0;
			move.setText("さくら色");
		} else {

		}
	}

	public void lose() {
		if (count > 182) {
			Alert failed = new Alert(AlertType.INFORMATION);
			failed.setTitle("GAMEOVER");
			failed.setContentText("遊戲結束!\n"+"請再挑戰!");
			failed.setHeaderText(null);
			failed.setGraphic(new ImageView(lose));
			failed.showAndWait();
			start(null);
		}
	}

	public void play(ActionEvent event) {
		if (gekitei.isPlaying()) {
			gekitei.stop();
		} else {
			gekitei.setCycleCount(AudioClip.INDEFINITE);
			gekitei.play();
		}
	}

	public void chpic(ActionEvent event) {
		countclick += 1;
		if (countclick % 2 == 0) {
			extra(0);
		} else {
			extra(1);
		}
	}

	public void extra(int k) {
		switch (k) {
		case 0:
			ImageView[] icon = { icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9 };
			path1 = "images/bride_01.jpg";
			path2 = "images/bride_02.jpg";
			path3 = "images/bride_03.jpg";
			path4 = "images/bride_04.jpg";
			path5 = "images/bride_05.jpg";
			path6 = "images/bride_06.jpg";
			path7 = "images/bride_07.jpg";
			path8 = "images/bride_08.jpg";
			path9 = "images/bride_09.jpg";
			Image[] pic = { new Image(path1), new Image(path2), new Image(path3), new Image(path4), new Image(path5),
					new Image(path6), new Image(path7), new Image(path8), new Image(path9) };
			for (int i = 0; i < 9; i++) {
				icon[i].setImage(pic[i]);
			}
			break;
		case 1:
			ImageView[] icona = { icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9 };
			path1 = "images/dance_01.jpg";
			path2 = "images/dance_02.jpg";
			path3 = "images/dance_03.jpg";
			path4 = "images/dance_04.jpg";
			path5 = "images/dance_05.jpg";
			path6 = "images/dance_06.jpg";
			path7 = "images/dance_07.jpg";
			path8 = "images/dance_08.jpg";
			path9 = "images/dance_09.jpg";
			Image[] pica = { new Image(path1), new Image(path2), new Image(path3), new Image(path4), new Image(path5),
					new Image(path6), new Image(path7), new Image(path8), new Image(path9) };
			for (int i = 0; i < 9; i++) {
				icona[i].setImage(pica[i]);
			}
			break;
		}
	}

	public void moveover(MouseEvent event) {
		Image reason = new Image("images/dance_01.jpg"), reason1 = new Image("images/bride_01.jpg");
		if (icon1.getImage().impl_getUrl().equals(reason.impl_getUrl())
				&& event.getButton().equals(MouseButton.PRIMARY)) {
			extra(0);
		} else if (icon1.getImage().impl_getUrl().equals(reason1.impl_getUrl())
				&& event.getButton().equals(MouseButton.SECONDARY)) {
			extra(1);
		}
	}
}
