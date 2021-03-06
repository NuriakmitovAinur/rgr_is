package pack; /*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Index frame = new Index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel panel, panel_1;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton calc;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_1,label_2,label_3,label_4, label_5, label_6;
	// компонент на котором располагается текст
	public static JTextField rash_100_km, calc_topl, calc_km, km, price;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox check_calc;// компонент флажок
	public static int int_calc=0, p=0;//переменная типа integer, доступная любому классу
		/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

		
	public Index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Расчет расхода топлива"); //устанавливает название окна 
		setSize(460, 330); // указывает ширину (370) и высоту (430).
		setLocationRelativeTo(null);//установить посередине экрана
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        panel = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста
		panel_1 = new JPanel();//Панель на которой располагается кнопка

		add(panel, BorderLayout.CENTER);//Добавление панели panel по центру
		add(panel_1, BorderLayout.SOUTH);//Добавление панели panel_1 снизу

		panel.setBorder(new EmptyBorder(5,10,70,10));//установка внутренних отступов(5 справа и слева,10сверху и снизу)

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		panel.setLayout(new GridLayout(6,2,10,5));/* на панеле будет 6 строк, 2 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		panel_1.setLayout(new GridLayout(1,1));//на панели 1 строка,1столбец, будет расположена кнопка

		label_1 = new JLabel("Расход топлива, л/100км:", JLabel.LEFT);
		label_2 = new JLabel("     Рассчитать", JLabel.LEFT);
		label_3 = new JLabel("     Израсходовано топлива, л:", JLabel.LEFT);
		label_4 = new JLabel("     Пройденное расстояние, км:", JLabel.LEFT);
		label_5 = new JLabel("Расстояние, км:", JLabel.LEFT);
		label_6 = new JLabel("Цена топлива за 1 литр, руб:", JLabel.LEFT);


		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		
		calc = new JButton("Рассчитать расход топлива"); //В скобках - надпись на кнопке
		
		check_calc = new JCheckBox();//компонент флажок 
		check_calc.setToolTipText("Необходимо рассчитать расход топлива на 100 км");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		rash_100_km = new JTextField();
		rash_100_km.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		rash_100_km.setToolTipText("Введите расход топлива на 100 км");//всплывающая подсказка при наведении на текстовое поле
    	
		calc_topl = new JTextField();
		calc_topl.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		calc_topl.setToolTipText("Введите количество израсходованного топлива");//всплывающая подсказка при наведении на текстовое поле
    			
		calc_km = new JTextField();
		calc_km.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		calc_km.setToolTipText("Введите пройденное расстояние");//всплывающая подсказка при наведении на текстовое поле

		km = new JTextField();
		km.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		km.setToolTipText("Введите расстояние на которое необходимо рассчитать расход топлива");//всплывающая подсказка при наведении на текстовое поле

		price = new JTextField();
		price.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		price.setToolTipText("Введите цену топлива за 1 литр");//всплывающая подсказка при наведении на текстовое поле
        
		panel_1.add(calc);//Добавление кнопки на панель panel_1
		
		//Добавление компонентов JLabel, JTextField, JCheckBox на панель panel
		panel.add(label_1);
		panel.add(rash_100_km);
		panel.add(label_2);
		panel.add(check_calc);
		panel.add(label_3);
		panel.add(calc_topl);
		panel.add(label_4);
		panel.add(calc_km);
		panel.add(label_5);
		panel.add(km);	
		panel.add(label_6);
		panel.add(price);	
		//Добавление компонентов JLabel, JTextField, JCheckBox на панель panel
		calc_topl.setEditable(false);//запретить записывать данные в поле израсходовано топлива
		calc_km.setEditable(false);//запретить записывать данные в поле пройденное расстояние
		
		
		check_calc.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_calc)//если событие произошло именно с флажком in, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что расход топлива на 100 км неизвестен и его надо рассчитать */
						 int_calc=1;//переменная отвечающая за информацию о необходимости расчета топлива на 100 км, 1-да, 0-нет
						 rash_100_km.setEditable(false);//в поле расход топлива на 100 км невозможно записывать данные
						 calc_topl.setEditable(true);//открыть поле израсходовано топлива для записи
						 calc_km.setEditable(true);//открыть поле пройденное расстояние для записи
					}
					else { //флажок выключен
						int_calc=0;//переменная отвечающая за информацию о необходимости расчета топлива на 100 км
						rash_100_km.setEditable(true);//разрешить записывать данные в поле расход толпива на 100 км
						calc_topl.setEditable(false);//запретить записывать данные в поле израсходовано топлива
						calc_km.setEditable(false);//запретить записывать данные в поле пройденное расстояние

					}
			}                                                       
    	   }); 	
		
		calc.addActionListener(new ActionListener()   
    			/* 	out - кнопка Рассчитать объем
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  
    	    	  	    	
    	    	if (int_calc==0){ /*если флажок Рассчитать не был нажат то проверяем правильно ли записаны
    	    		данные в поле расход топлива на 100 км. Если флажок не был нажат - проверяем правильно ли 
    	    		записаны данные в поля израсходовано топлива и пройденное расстояние. Переменная int_calc отвечает 
    	    		за то нажат был флажок или нет (0 - нет, 1 - да). Переменная задается выше при обработке 
    	    		слушателя события флажок (check_calc.addItemListener...) */
    	    		if (isValidInput(rash_100_km, "расход топлива на 100 км")) 
    	    			/* if - оператор если. функция isValidInput проверяет данные на правильность, т.е. 
        		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
        		   		Если введены некорректные данные, то выдает ошибку. Описана ниже */	
    	    		{ p=1;
    	    		  /*переменная p хранит в себе данные о том были введены верные данные или нет в поля 
    	    			расход топлива на 100 км, израсходовано топлива, пройденное расстояние. 0 - нет,
    	    			 1 - верные. */
    	    		} else {p=0;}
    	    			
    	    	} else {
    	    		/* if - оператор если. функция isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку. Описана ниже */	    	    		
    	    		if (isValidInput(calc_topl, "количество израсходованного топлива")&&
    	    			isValidInput(calc_km, "пройденное расстояние")){p=1; } else {p=0;}
    	    		 /*переменная p хранит в себе данные о том были введены верные данные или нет в поля 
	    			расход топлива на 100 км, израсходовано топлива, пройденное расстояние. 0 - нет,
	    			 1 - верные. */
    	    	}
	    			
    	    	if (p==1){
    	    		
    	    	if ((isValidInput(km, "расстояние")) && 
    	    		(isValidInput(price, "цену топлива за 1 литр")))
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку */	
    	    		{
    	    			Calc.gettext(); /* Обращаемся в класс calc к методу gettext 	*/
		    	    	frame.setVisible(false);//Окно становится невидимым
		    	    	Result.main(null);
		    	    	/* 	что будет происходить при нажатии на кнопку 
		    				(открывается новое окно с результатами) 
		    				программа передает в метод main класса Result null. 
		    				Тем самым происходит запуск метода без передачи переменных */
	        	    	}
               	} 
    	     }                                                        
    	   });  

	
	
	
	}
//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
              
                 double num = Double.parseDouble(jtxt.getText()); //попытка преобразовать текст в целое число      
                return true; //если все нормально - возвращаем true

            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/

                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле

                return false;//ошибка - возвращаем false
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	

}
