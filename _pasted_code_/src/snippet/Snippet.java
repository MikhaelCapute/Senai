package snippet;

public class Snippet {
	RODRIGO DACOME LIMA
	Criado em: 29 de mai.29 de mai.
	Projeto 30 b:
	Exibindo Projeto 30 b.jpg
	Projeto 30 b.jpg
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-30-a: const int NUM_LINHAS = 4;…"
	RODRIGO DACOME LIMA
	Criado em: 29 de mai.29 de mai.
	Projeto-30-a:
	
	const int NUM_LINHAS = 4;
	const int NUM_COLUNAS = 4;
	const int DEBOUNCE = 20;
	const char TECLADO[NUM_LINHAS][NUM_COLUNAS] = {
	{'1','2','3','A'},
	{'4','5','6','B'},
	{'7','8','9','C'},
	{'*','0','#','D'}};
	const int PINOS_LINHAS[NUM_LINHAS] = {9,8,7,6};
	const int PINOS_COLUNAS[NUM_COLUNAS] = {5,4,3,2};
	const char NADA = 0;
	
	void setup()
	{
	  Serial.begin(9600);
	  for(int linha=0;linha<NUM_LINHAS;linha++){
	    pinMode(PINOS_LINHAS[linha],INPUT);
	    digitalWrite(PINOS_LINHAS[linha],HIGH);//habilita pull-up
	  }
	  for(int coluna=0;coluna<NUM_COLUNAS;coluna++){
	    pinMode(PINOS_COLUNAS[coluna],OUTPUT);
	    digitalWrite(PINOS_COLUNAS[coluna],HIGH);
	  }
	  Serial.println("-- Pressione uma tecla --");
	}
	
	void loop()
	{
	  char tecla = teclaPressionada();
	  if(tecla != NADA){
	    Serial.print("Tecla pressionada: ");
	    Serial.println(tecla);
	  }
	}
	
	char teclaPressionada(){
	  char tecla = NADA;
	  boolean achou = false;
	  for(int coluna=0;coluna<NUM_COLUNAS;coluna++){
	    digitalWrite(PINOS_COLUNAS[coluna],LOW);
	    for(int linha=0;linha<NUM_LINHAS;linha++){
	      if(digitalRead(PINOS_LINHAS[linha]) == LOW){
	        delay(DEBOUNCE);
	      }
	      if(digitalRead(PINOS_LINHAS[linha]) == LOW){
	        while(digitalRead(PINOS_LINHAS[linha]) != HIGH);
	        tecla = TECLADO[linha][coluna];
	        achou = true;
	        break;
	      }
	    }
	    digitalWrite(PINOS_COLUNAS[coluna],HIGH);
	    if(achou){
	      break;
	    }
	  }
	  return tecla;
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-29-c-potenciômetro-barra-de-led…"
	RODRIGO DACOME LIMA
	Criado em: 29 de mai.29 de mai.
	Projeto-29-c-potenciômetro-barra-de-leds:
	
	const int MOTOR = 3;
	const int POT = A0;
	int valorPot = 0;
	int valorLido = 0;
	int barraLed[] = {2,4,5,6,7,8,9,10,11,12};
	
	void setup()
	{
	  Serial.begin(9600);
	  pinMode(MOTOR, OUTPUT);
	  for(int i=0;i<=9;i++){
	    pinMode(barraLed[i],OUTPUT);
	  }
	}
	
	void loop()
	{
	  valorPot = analogRead(POT);
	  valorLido = map(valorPot, 0, 1023, 0, 255);
	  analogWrite(MOTOR, valorLido);
	  Serial.println(valorLido);
	  for(int i=0;i<=9;i++){
	    if(valorLido > ((i+1)*25)){
	      digitalWrite(barraLed[i],HIGH);
	    }else{
	      digitalWrite(barraLed[i],LOW);
	    }
	  }
	  delay(10);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-28-d-rotação-contínua: #include…"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai.
	Projeto-28-d-rotação-contínua:
	
	#include <Servo.h>
	
	Servo servo;
	int recebido = 0;
	
	void setup()
	{
	  servo.attach(3);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	 
	  if(Serial.available()>0){
	    String input = Serial.readStringUntil('\n');
	    int recebido = input.toInt();
	    if(recebido>=0 && recebido<=180){
	      servo.write(recebido);
	    }
	    Serial.println(recebido);
	  }  
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-28-c-serial: #include <Servo.h>…"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai.
	Projeto-28-c-serial:
	
	#include <Servo.h>
	
	Servo servo;
	int recebido = 0;;
	int posicao = 0;
	
	void setup()
	{
	  servo.attach(3);
	  Serial.begin(9600);
	  servo.write(0);
	}
	
	void loop()
	{
	  if(Serial.available()>0){
	    recebido = Serial.read();
	    if(recebido == '+'){
	      posicao = posicao + 10;
	      Serial.println(posicao);
	    }
	    if(recebido == '-'){
	      posicao = posicao - 10;
	      Serial.println(posicao);
	    }
	    servo.write(posicao);
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-28-b-for: #include <Servo.h>…"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai.
	Projeto-28-b-for:
	
	#include <Servo.h>
	
	Servo servo;
	
	int pos = 0;
	
	void setup()
	{
	  servo.attach(3);
	}
	
	void loop()
	{
	  for(pos = 0; pos <= 180; pos++){
	    servo.write(pos);
	    delay(15);
	  }
	 
	  for(pos = 180; pos >= 0; pos--){
	    servo.write(pos);
	    delay(15);
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-29-c-Potenciômetro-Barra-de-Leds"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai.
	Projeto-29-c-Potenciômetro-Barra-de-Leds
	Exibindo Projeto-29-c-Potenciômetro-Barra-de-Leds.jpg
	Projeto-29-c-Potenciômetro-Barra-de-Leds.jpg
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-29-b-Potenciômetro: const int…"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai. (editado: 28 de mai.)
	Projeto-29-b-Potenciômetro:
	
	const int MOTOR = 3;
	const int POT = A0;
	int valorPot = 0;
	int valorLido = 0;
	
	void setup(){
	  Serial.begin(9600);
	  pinMode(MOTOR, OUTPUT);
	}
	
	void loop(){
	  valorPot = analogRead(POT);
	  valorLido = map(valorPot, 0, 1023, 0, 255);
	  analogWrite(MOTOR, valorLido);
	  Serial.println(valorLido);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 29 a: const int PWM = 3; void…"
	RODRIGO DACOME LIMA
	Criado em: 28 de mai.28 de mai.
	Projeto 29 a:
	const int PWM = 3;
	
	void setup()
	{
	  pinMode(PWM, OUTPUT);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  for(int i=0;i<=255;i++){
	    analogWrite(PWM,i);
	    delay(50);
	    Serial.println(i);
	  }
	  for(int i=255;i>=0;i--){
	    analogWrite(PWM,i);
	    delay(50);
	    Serial.println(i);
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 27 b: const int LED_VERMELHO =…"
	RODRIGO DACOME LIMA
	Criado em: 24 de mai.24 de mai.
	Projeto 27 b:
	const int LED_VERMELHO = 2;
	const int LED_AMARELO = 3;
	const int LED_VERDE = 4;
	const int BUZZER = 5;
	const int TRIG = 13;
	const int ECHO = 12;
	long duracao = 0;
	long distancia = 0;
	
	
	void setup()
	{
	  pinMode(LED_VERMELHO, OUTPUT);
	  pinMode(LED_AMARELO, OUTPUT);
	  pinMode(LED_VERDE, OUTPUT);
	  pinMode(BUZZER, OUTPUT);
	  pinMode(TRIG, OUTPUT);
	  pinMode(ECHO, INPUT);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  duracao = lerDistancia();
	  distancia = duracao / 58;
	  if(distancia<10){
	    digitalWrite(LED_VERMELHO,HIGH);
	    digitalWrite(LED_AMARELO,LOW);
	    digitalWrite(LED_VERDE,LOW);
	    tocaBuzzer(200,880);
	  }else if(distancia<25){
	    digitalWrite(LED_VERMELHO,LOW);
	    digitalWrite(LED_AMARELO,HIGH);
	    digitalWrite(LED_VERDE,LOW);
	    tocaBuzzer(600,660);
	  }else if(distancia<50){
	    digitalWrite(LED_VERMELHO,LOW);
	    digitalWrite(LED_AMARELO,LOW);
	    digitalWrite(LED_VERDE,HIGH);
	    tocaBuzzer(1000,440);
	  }else{
	    digitalWrite(LED_VERMELHO,LOW);
	    digitalWrite(LED_AMARELO,LOW);
	    digitalWrite(LED_VERDE,LOW);
	    //toTone(BUZZER);
	  }
	  Serial.print("Distancia: ");
	  Serial.print(distancia);
	  Serial.println(" cm");
	  delay(10);
	}
	
	long lerDistancia(){
	  digitalWrite(TRIG,LOW);
	  delayMicroseconds(2);
	  digitalWrite(TRIG,HIGH);
	  delayMicroseconds(10);
	  digitalWrite(TRIG,LOW);
	  return pulseIn(ECHO,HIGH);
	}
	
	void tocaBuzzer(int tempo,int freq){
	  tone(BUZZER,freq);
	  delay(10);
	  noTone(BUZZER);
	  delay(tempo);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 1: const int ledPin = 13; //led…"
	RODRIGO DACOME LIMA
	Criado em: 23 de mai.23 de mai.
	Projeto 1:
	const int ledPin = 13; //led no pino 13
	const int Botao = 2; //botao no pino 2
	int EstadoBotao = 0; //Variavel para ler o status do pushbutton
	void setup(){
	pinMode(ledPin, OUTPUT); //Pino do led será saída
	pinMode(Botao, INPUT); //Pino com botão será entrada
	}
	void loop(){
	EstadoBotao = digitalRead(Botao); /*novo estado do botão vai ser igual ao que
	Arduino ler no pino onde está o botão.
	Poderá ser ALTO (HIGH)se o botão estiver
	Pressionado, ou BAIXO (LOW),se o botão
	estiver solto */
	if (EstadoBotao == HIGH){ //Se botão estiver pressionado (HIGH)
	digitalWrite(ledPin, HIGH); // acende o led do pino 13.
	}
	else{ //se não estiver pressionado
	digitalWrite(ledPin, LOW); //deixa o led do pino 13 apagado
	}
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 26 circuito:"
	RODRIGO DACOME LIMA
	Criado em: 22 de mai.22 de mai.
	Projeto 26 circuito:
	Exibindo Projeto 26.jpg
	Projeto 26.jpg
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 26: #include "LiquidCrystal.h"…"
	RODRIGO DACOME LIMA
	Criado em: 22 de mai.22 de mai.
	Projeto 26:
	
	#include "LiquidCrystal.h"
	
	LiquidCrystal lcd(12,11,7,6,5,4);
	const int BOTAO_1 = 2;
	const int BOTAO_2 = 3;
	int estadoBotao1 = 0;
	int estadoBotao2 = 0;
	int velocidade = 200;
	int sentido = 0; //0=direita p esquerda - 1=esquerda p direita
	int i, x, k = 0;
	
	void setup()
	{
	 
	  pinMode(BOTAO_1, INPUT);
	  pinMode(BOTAO_2, INPUT);
	  attachInterrupt(digitalPinToInterrupt(BOTAO_1), rebateuDireita, RISING);//interrupção no pino 2 = 0
	  attachInterrupt(digitalPinToInterrupt(BOTAO_2), rebateuEsquerda, RISING);
	  lcd.begin(16, 2);
	  lcd.print(" Ping Pong v1.0 ");
	  delay(2000);
	  lcd.clear();
	}
	
	void loop()
	{
	  jogo();
	}
	
	void jogo(){
	  while(1){
	    if(sentido == 0){
	      for(i=15;i>=0;i--){
	        switch(k){
	          case 0:
	            lcd.setCursor(i,0);
	            lcd.print("o");
	            delay(velocidade);
	            lcd.clear();
	            k=1;
	          break;
	          case 1:
	            lcd.setCursor(i,1);
	            lcd.print("o");
	            delay(velocidade);
	            lcd.clear();
	            k=0;
	          break;
	        }
	      }
	    }
	    if(sentido == 1){
	      for(i=0;i<=15;i++){
	        switch(k){
	          case 0:
	            lcd.setCursor(i,0);
	            lcd.print("o");
	            delay(velocidade);
	            lcd.clear();
	            k=1;
	          break;
	          case 1:
	            lcd.setCursor(i,1);
	            lcd.print("o");
	            delay(velocidade);
	            lcd.clear();
	            k=0;
	          break;
	        }
	      }
	    }
	  }
	}
	
	void rebateuEsquerda(){
	  if(i == 0){
	    sentido = 1;
	    velocidade = velocidade-50;
	    if(velocidade <= 50){
	      velocidade = 50;
	    }
	  }else{
	    fimDeJogo(0);
	  }
	}
	
	void rebateuDireita(){
	  if(i == 15){
	    sentido = 0;
	    velocidade = velocidade-50;
	    if(velocidade <= 50){
	      velocidade = 50;
	    }
	  }else{
	    fimDeJogo(1);
	  }
	}
	
	void fimDeJogo(int x){
	  if(x == 0){
	    lcd.clear();
	    lcd.print("Esquerda perdeu!");
	    lcd.setCursor(0,1);
	    lcd.print("RESETE o Arduino");
	    while(1);
	  }else if(x == 1){
	    lcd.clear();
	    lcd.print("Direita perdeu!");
	    lcd.setCursor(0,1);
	    lcd.print("RESETE o Arduino");
	    while(1);
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto Projeto-25-b-com-LCD: #include…"
	RODRIGO DACOME LIMA
	Criado em: 21 de mai.21 de mai. (editado: 21 de mai.)
	Projeto Projeto-25-b-com-LCD:
	#include <LiquidCrystal.h>
	
	LiquidCrystal lcd(12,11,10,9,8,7);
	const int BUZZER = 5;
	const int BOTAO_1 = 4;
	const int BOTAO_2 = 3;
	const int BOTAO_3 = 2;
	int estadoBotao1 = 0;
	int estadoBotao2 = 0;
	int estadoBotao3 = 0;
	int segundos = 0;
	int minutos = 0;
	
	void setup()
	{
	  pinMode(BOTAO_1,INPUT);
	  pinMode(BOTAO_2,INPUT);
	  pinMode(BOTAO_3,INPUT);
	  pinMode(BUZZER,OUTPUT);
	  lcd.begin(16,2);
	  inicializacao();
	}
	
	void loop()
	{
	  estadoBotao1 = digitalRead(BOTAO_1);
	  if(estadoBotao1 == HIGH){
	    delay(150);
	    estadoBotao1 = digitalRead(BOTAO_1);
	    if(estadoBotao1 == HIGH){
	      segundos++;
	      if(segundos>=60){
	        segundos = 0;
	        lcd.setCursor(11,0);
	        lcd.print(" ");
	      }
	      lcd.setCursor(0,0);
	      lcd.print("Segundos: ");
	      lcd.print(segundos);    
	    }
	  }
	 
	  estadoBotao2 = digitalRead(BOTAO_2);
	  if(estadoBotao2 == HIGH){
	    delay(150);
	    estadoBotao2 = digitalRead(BOTAO_2);
	    if(estadoBotao2 == HIGH){
	      minutos++;
	      if(minutos>=60){
	        minutos = 0;
	        lcd.setCursor(10,1);
	        lcd.print(" ");
	      }
	      lcd.setCursor(0,1);
	      lcd.print("Minutos: ");
	      lcd.print(minutos);
	    }
	  }
	 
	  estadoBotao3 = digitalRead(BOTAO_3);
	  if(estadoBotao3 == HIGH){
	    delay(150);
	    estadoBotao3 = digitalRead(BOTAO_3);
	    if(estadoBotao3 == HIGH){
	      if((minutos!=0) || (segundos!=0)){
	        lcd.clear();
	        lcd.print("START");
	        delay(1000);
	        if(segundos==0){
	          minutos--;
	          segundos=59;
	        }
	        while((segundos>0) || (minutos>0)){
	          if(minutos<10){
	            lcd.setCursor(5,1);
	            lcd.print("0");
	            lcd.print(minutos);
	            lcd.print(":");
	          }else{
	            lcd.setCursor(5,1);
	            lcd.print(minutos);
	            lcd.print(":");
	          }
	          if(segundos<10){
	            lcd.print("0");
	            lcd.print(segundos);
	          }else{
	            lcd.print(segundos);
	          }
	          segundos--;
	          if(segundos<0){
	            minutos--;
	            segundos=59;
	          }
	          delay(1000);//Base de tempo de 1 segundo
	          if((segundos<=0) && (minutos<=0)){
	            lcd.clear();
	            lcd.println("ACABOU O TEMPO!!!");
	            for(int i=0;i<4;i++){
	              tone(BUZZER,660);
	              delay(500);
	              tone(BUZZER,440);
	              delay(500);
	            }
	            noTone(BUZZER);
	          }
	        }
	        inicializacao();
	      }
	    }
	  }
	}
	
	void inicializacao(){
	  lcd.clear();//Limpa a tela e posiciona no canto superior esquerdo.
	  lcd.print("Selecione o");
	  lcd.setCursor(0,1);
	  lcd.print("tempo do timer..");
	  delay(2000);
	  lcd.clear();
	  lcd.print("Segundos: ");
	  lcd.print(segundos);
	  lcd.setCursor(0,1);
	  lcd.print("Minutos: ");
	  lcd.print(minutos);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Link da atividade com a pedagoga…"
	RODRIGO DACOME LIMA
	Criado em: 20 de mai.20 de mai.
	Link da atividade com a pedagoga Lilian:
	https://app.deepersignals.com/auth/verify/campaign/a7f7e642c7fdd8f7a6f163be68d7a79b?account=Insigna
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-25-b-com-LCD:"
	RODRIGO DACOME LIMA
	Criado em: 20 de mai.20 de mai.
	Projeto-25-b-com-LCD:
	Exibindo Projeto-24-b-com-LCD.jpg
	Projeto-24-b-com-LCD.jpg
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 25 a: const int BUZZER = 5;…"
	RODRIGO DACOME LIMA
	Criado em: 20 de mai.20 de mai.
	Projeto 25 a:
	const int BUZZER = 5;
	const int BOTAO_1 = 4;
	const int BOTAO_2 = 3;
	const int BOTAO_3 = 2;
	int estadoBotao1 = 0;
	int estadoBotao2 = 0;
	int estadoBotao3 = 0;
	int segundos = 0;
	int minutos = 0;
	
	void setup()
	{
	  pinMode(BOTAO_1,INPUT);
	  pinMode(BOTAO_2,INPUT);
	  pinMode(BOTAO_3,INPUT);
	  pinMode(BUZZER,OUTPUT);
	  Serial.begin(9600);
	  Serial.println("Selecione o tempo do timer...");
	  Serial.println("Minutos: 0");
	  Serial.println("Segundos: 0");
	}
	
	void loop()
	{
	  estadoBotao1 = digitalRead(BOTAO_1);
	  if(estadoBotao1 == HIGH){
	    delay(150);
	    estadoBotao1 = digitalRead(BOTAO_1);
	    if(estadoBotao1 == HIGH){
	      segundos++;
	      if(segundos>=60){
	        segundos = 0;
	      }
	      Serial.print("Segundos: ");
	      Serial.println(segundos);            
	    }
	  }
	 
	  estadoBotao2 = digitalRead(BOTAO_2);
	  if(estadoBotao2 == HIGH){
	    delay(150);
	    estadoBotao2 = digitalRead(BOTAO_2);
	    if(estadoBotao2 == HIGH){
	      minutos++;
	      if(minutos>=60){
	        minutos = 0;
	      }
	      Serial.print("Minutos:");
	      Serial.println(minutos);
	    }
	  }
	 
	  estadoBotao3 = digitalRead(BOTAO_3);
	  if(estadoBotao3 == HIGH){
	    delay(150);
	    estadoBotao3 = digitalRead(BOTAO_3);
	    if(estadoBotao3 == HIGH){
	      if((minutos!=0) || (segundos!=0)){
	        Serial.println("START");
	        delay(1000);
	        if(segundos==0){
	          minutos--;
	          segundos=59;
	        }
	        while((segundos>0) || (minutos>0)){
	          if(minutos<10){
	            Serial.print("0");
	            Serial.print(minutos);
	            Serial.print(":");
	          }else{
	            Serial.print(minutos);
	            Serial.print(":");
	          }
	          if(segundos<10){
	            Serial.print("0");
	            Serial.println(segundos);
	          }else{
	            Serial.println(segundos);
	          }
	          segundos--;
	          if(segundos<0){
	            minutos--;
	            segundos=59;
	          }
	          delay(1000);//Base de tempo de 1 segundo
	          if((segundos<=0) && (minutos<=0)){
	            Serial.println("ACABOU O TEMPO!!!");
	            for(int i=0;i<4;i++){
	              tone(BUZZER,660);
	              delay(500);
	              tone(BUZZER,440);
	              delay(500);
	            }
	            noTone(BUZZER);
	          }
	        }
	        Serial.println("Selecione o tempo do timer...");
	      }
	    }
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto-24-a-sem-LCD"
	RODRIGO DACOME LIMA
	Criado em: 20 de mai.20 de mai.
	Projeto-24-a-sem-LCD
	Exibindo Projeto-24-a-sem-LCD.jpg
	Projeto-24-a-sem-LCD.jpg
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 24: int numeroSorteado = 0;…"
	RODRIGO DACOME LIMA
	Criado em: 17 de mai.17 de mai.
	Projeto 24:
	int numeroSorteado = 0;
	const int BOTAO = 2;
	int estadoBotao = 0;
	const int A = 4;
	const int B = 5;
	const int C = 6;
	const int D = 7;
	
	void setup(){
	  pinMode(A,OUTPUT);
	  pinMode(B,OUTPUT);
	  pinMode(C,OUTPUT);
	  pinMode(D,OUTPUT);
	}
	
	void loop(){
	  estadoBotao = digitalRead(BOTAO);
	  if(estadoBotao == HIGH){
	    delay(150);
	    estadoBotao = digitalRead(BOTAO);
	    if(estadoBotao == LOW){
	      animacao();
	      numeroSorteado = random(6);
	      numeroSorteado = numeroSorteado + 1;
	      switch(numeroSorteado){
	        case 1:
	          acende1();
	        break;
	        case 2:
	          acende2();
	        break;
	        case 3:
	          acende3();
	        break;
	        case 4:
	          acende4();
	        break;
	        case 5:
	          acende5();
	        break;
	        case 6:
	          acende6();
	        break;
	      }
	    }
	  }
	}
	
	void acende1(){
	  digitalWrite(A,HIGH);
	  digitalWrite(B,LOW);
	  digitalWrite(C,LOW);
	  digitalWrite(D,LOW);
	}
	
	void acende2(){
	  digitalWrite(A,LOW);
	  digitalWrite(B,HIGH);
	  digitalWrite(C,LOW);
	  digitalWrite(D,LOW);
	}
	
	void acende3(){
	  digitalWrite(A,HIGH);
	  digitalWrite(B,HIGH);
	  digitalWrite(C,LOW);
	  digitalWrite(D,LOW);
	}
	
	void acende4(){
	  digitalWrite(A,LOW);
	  digitalWrite(B,LOW);
	  digitalWrite(C,HIGH);
	  digitalWrite(D,LOW);
	}
	
	void acende5(){
	  digitalWrite(A,HIGH);
	  digitalWrite(B,LOW);
	  digitalWrite(C,HIGH);
	  digitalWrite(D,LOW);
	}
	
	void acende6(){
	  digitalWrite(A,LOW);
	  digitalWrite(B,HIGH);
	  digitalWrite(C,HIGH);
	  digitalWrite(D,LOW);
	}
	
	void apaga(){
	  //Digito 15, como não está entre
	  //0 e 9, o CI apaga o display.
	  digitalWrite(A,HIGH);
	  digitalWrite(B,HIGH);
	  digitalWrite(C,HIGH);
	  digitalWrite(D,HIGH);
	}
	
	void animacao(){
	  for(int i=0;i<4;i++){
	    acende2();
	    delay(250);
	    acende5();
	    delay(250);
	  }
	  apaga();
	  delay(1000);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Exe4mplo9 de uso da comando "random":…"
	RODRIGO DACOME LIMA
	Criado em: 17 de mai.17 de mai.
	Exe4mplo9 de uso da comando "random":
	
	int numeroSorteado = 0;
	
	void setup()
	{
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  numeroSorteado = random(6); //Sorteia um número de 0 a 5.
	  numeroSorteado = numeroSorteado + 1;
	  Serial.print("Numero sorteado: ");
	  Serial.println(numeroSorteado);
	  delay(1000);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 22: #include "LiquidCrystal.h"…"
	RODRIGO DACOME LIMA
	Criado em: 15 de mai.15 de mai.
	Projeto 22:
	#include "LiquidCrystal.h"
	
	int freq = 0;
	int estadoBotao1 = 0;
	int estadoBotao2 = 0;
	const int BOTAO_01 = 8;
	const int BOTAO_02 = 9;
	const int BUZZER = 6;
	LiquidCrystal lcd(12,11,5,4,3,2);
	
	
	void setup()
	{
	  lcd.begin(16,2);
	  lcd.setCursor(0,0);
	  lcd.print("Frequencia = ");
	  lcd.setCursor(6,1);
	  lcd.print("Hz");
	  pinMode(BOTAO_01,INPUT);
	  pinMode(BOTAO_02,INPUT);
	  pinMode(BUZZER,OUTPUT);
	}
	
	void loop()
	{
	  estadoBotao1 = digitalRead(BOTAO_01);
	  estadoBotao2 = digitalRead(BOTAO_02);
	 
	  if(estadoBotao1 == HIGH){
	    freq = freq + 100;
	  }
	 
	  if(estadoBotao2 == HIGH){
	    freq = freq - 100;
	  }
	 
	  if(freq <= 0){
	    freq = 0;
	  }
	 
	  if(freq >= 20000){
	    freq = 20000;
	  }
	 
	  if(freq >= 10000){
	    lcd.setCursor(0,1);
	  }else{
	    if(freq >= 1000){
	      lcd.setCursor(0,1);
	      lcd.print(" ");
	      lcd.setCursor(1,1);
	    }else{
	      if(freq >= 100){
	        lcd.setCursor(0,1);
	        lcd.print(" ");
	        lcd.setCursor(1,1);
	        lcd.print(" ");
	        lcd.setCursor(2,1);
	      }else{
	        if(freq >= 10){
	          lcd.setCursor(0,1);
	          lcd.print(" ");
	          lcd.setCursor(1,1);
	          lcd.print(" ");
	          lcd.setCursor(2,1);
	          lcd.print(" ");
	          lcd.setCursor(3,1);
	        }else{
	          lcd.setCursor(0,1);
	          lcd.print(" ");
	          lcd.setCursor(1,1);
	          lcd.print(" ");
	          lcd.setCursor(2,1);
	          lcd.print(" ");
	          lcd.setCursor(3,1);
	          lcd.print(" ");
	          lcd.setCursor(4,1);
	        }
	      }
	    }
	  }
	 
	  lcd.print(freq);
	  tone(BUZZER,freq);
	  delay(100);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 20: #include <LiquidCrystal.h>…"
	RODRIGO DACOME LIMA
	Criado em: 14 de mai.14 de mai.
	Projeto 20:
	#include <LiquidCrystal.h>
	
	LiquidCrystal lcd(12,11,5,4,3,2);
	
	byte smile[8] = {
	  B00000,
	  B00000,
	  B01010,
	  B00000,
	  B00000,
	  B10001,
	  B01110,
	  B00000
	};
	
	byte grau[8] = {
	  B00100,
	  B01010,
	  B00100,
	  B00000,
	  B00000,
	  B00000,
	  B00000,
	  B00000
	};
	
	byte sino[8] = {
	  B00100,
	  B01110,
	  B01110,
	  B01110,
	  B11111,
	  B00000,
	  B00100,
	  B00000
	};
	
	byte relogio[8] = {
	  B00000,
	  B01110,
	  B10101,
	  B10111,
	  B10001,
	  B01110,
	  B00000,
	  B00000
	};
	
	byte check[8] = {
	  B00000,
	  B00001,
	  B00011,
	  B10110,
	  B11100,
	  B01000,
	  B00000,
	  B00000
	};
	
	byte enter[8] = {
	  B00001,
	  B00001,
	  B00101,
	  B01001,
	  B11111,
	  B01000,
	  B00100,
	  B00000
	};
	
	void setup()
	{
	  lcd.begin(16,2);
	  lcd.createChar(0,smile);
	  lcd.createChar(1,grau);
	  lcd.createChar(2,sino);
	  lcd.createChar(3,relogio);
	  lcd.createChar(4,check);
	  lcd.createChar(5,enter);
	}
	
	void loop()
	{
	  lcd.setCursor(0,0);
	  lcd.write(byte(0));
	  lcd.write(byte(1));
	  lcd.write(byte(2));
	  lcd.write(byte(3));
	  lcd.write(byte(4));
	  lcd.write(byte(5));
	  lcd.setCursor(0,1);
	  lcd.print("Scroll");
	 
	  for(int i=0;i<10;i++){
	    lcd.scrollDisplayRight();
	    delay(500);
	  }
	 
	  for(int i=0;i<10;i++){
	    lcd.scrollDisplayLeft();
	    delay(500);
	  }
	 
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 19: #include <LiquidCrystal.h>…"
	RODRIGO DACOME LIMA
	Criado em: 14 de mai.14 de mai.
	Projeto 19:
	#include <LiquidCrystal.h>
	
	LiquidCrystal lcd(12,11,5,4,3,2);
	int entrada = 0;
	int x = 0;
	int y = 0;
	
	void setup()
	{
	  lcd.begin(16,2);
	  lcd.setCursor(0,0);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  if(Serial.available() > 0){
	    entrada = Serial.read();
	    lcd.print(char(entrada));
	    x++;
	    y++;
	    if(x > 15){
	      lcd.setCursor(0,1);
	      x = 0;
	    }
	    if(y > 31){
	      lcd.setCursor(0,0);
	      y = 0;
	      x = 0;
	    }
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 18: #include <LiquidCrystal.h>…"
	RODRIGO DACOME LIMA
	Criado em: 14 de mai.14 de mai.
	Projeto 18:
	#include <LiquidCrystal.h>
	
	LiquidCrystal lcd(12,11,5,4,3,2);
	
	void setup()
	{
	  lcd.begin(16,2);
	  lcd.setCursor(0,0);
	  lcd.print("Ola, meu nome e:");
	  lcd.setCursor(0,1);
	  lcd.print("Rodrigo");
	}
	
	void loop()
	{
	 
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 17: // C++ code // const int…"
	RODRIGO DACOME LIMA
	Criado em: 13 de mai.13 de mai. (editado: 13 de mai.)
	Projeto 17:
	// C++ code
	//
	
	const int LDR = A0;
	const int TMP36 = A1;
	const int BUZZER = 2;
	const int LEDS[] = {5,6,7,8,9,10,11};
	int valorLum = 0;
	int valorTemp = 0;
	float temp = 0;
	
	void setup()
	{
	  Serial.begin(9600);
	  for(int i=0;i<7;i++){
	    pinMode(LEDS[i], OUTPUT);
	  }
	  pinMode(BUZZER, OUTPUT);
	}
	
	void loop()
	{
	  valorLum = analogRead(LDR); //Descarto esta leitura
	  delay(5);
	  valorLum = analogRead(LDR);
	  valorTemp = analogRead(TMP36); // Descarto esta leitura
	  delay(5);
	  valorTemp = analogRead(TMP36);
	  temp = ((valorTemp*0.0048828125)-0.5)*100;
	  Serial.print("LDR: ");
	  Serial.print(valorLum);
	  Serial.print(" - Temp: ");
	  Serial.println(temp);
	 
	  if(temp>0){
	    digitalWrite(LEDS[0],HIGH);
	  }else{
	    digitalWrite(LEDS[0],LOW);
	  }
	 
	  if(temp>50){
	    digitalWrite(LEDS[1],HIGH);
	  }else{
	    digitalWrite(LEDS[1],LOW);
	  }
	 
	  if(temp>100){
	    digitalWrite(LEDS[2],HIGH);
	  }else{
	    digitalWrite(LEDS[2],LOW);
	  }
	 
	  if(valorLum > 750){
	    digitalWrite(LEDS[3],HIGH);
	    digitalWrite(LEDS[6],LOW);
	    noTone(BUZZER);
	  }else{
	    digitalWrite(LEDS[3],LOW);
	    digitalWrite(LEDS[6],HIGH);
	    tone(BUZZER,440);
	  }
	 
	  if(valorLum > 825){
	    digitalWrite(LEDS[4],HIGH);
	  }else{
	    digitalWrite(LEDS[4],LOW);
	  }
	 
	  if(valorLum > 950){
	    digitalWrite(LEDS[5],HIGH);
	  }else{
	    digitalWrite(LEDS[5],LOW);
	  }
	
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Link do arquivo com a parte 01 dos…"
	RODRIGO DACOME LIMA
	Criado em: 13 de mai.13 de mai.
	Link do arquivo com a parte 01 dos projetos:
	https://drive.google.com/file/d/12L8T_jA1muE59yASJ8LNQr30c3HDxzsj/view?usp=drive_link
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 16: // C++ code // const int…"
	RODRIGO DACOME LIMA
	Criado em: 10 de mai.10 de mai.
	Projeto 16:
	// C++ code
	//
	
	const int LED = 11;
	const int LDR = A0;
	int valorLido = 0;
	int pwm = 0;
	
	void setup()
	{
	  pinMode(LED, OUTPUT);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  valorLido = analogRead(LDR);
	  Serial.print("Valor lido: ");
	  Serial.print(valorLido);
	  Serial.print(" - PWM: ");
	  Serial.println(pwm);
	 
	  if(valorLido<800){
	    analogWrite(LED, pwm);
	    pwm++;
	  }else{
	    analogWrite(LED, pwm);
	    pwm--;
	  }
	 
	  if(pwm>255){
	    pwm = 255;
	  }
	 
	  if(pwm<0){
	    pwm = 0;
	  }
	 
	  delay(10);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 15:const int LDR = A0; int…"
	RODRIGO DACOME LIMA
	Criado em: 10 de mai.10 de mai.
	Projeto 15:const int LDR = A0;
	int valorLido = 0;
	
	void setup()
	{
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  valorLido = analogRead(LDR);
	  Serial.print("Valor lido: ");
	  Serial.println(valorLido);
	  delay(100);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 14: const int POTENCIOMETRO =…"
	RODRIGO DACOME LIMA
	Criado em: 9 de mai.9 de mai.
	Projeto 14:
	
	const int POTENCIOMETRO = A0;
	int valorLido = 0;
	int pwm = 0;
	const int LED[] = {3,5,6,9};
	
	void setup()
	{
	  for(int i=0;i<4;i++){
	    pinMode(LED[i], OUTPUT);
	  }
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  valorLido = analogRead(POTENCIOMETRO);
	  Serial.print("Valor lido: ");
	  Serial.println(valorLido);
	 
	  int aux = valorLido;
	  for(int i=0;i<4;i++){
	    if(aux>255){
	      analogWrite(LED[i],255);
	    }else{
	      analogWrite(LED[i],aux);
	    }
	    aux = aux - 256;
	    if(aux<0){
	      aux=0;
	    }
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 13: const int POTENCIOMETRO =…"
	RODRIGO DACOME LIMA
	Criado em: 9 de mai.9 de mai.
	Projeto 13:
	const int POTENCIOMETRO = A0;
	int valorPot = 0;
	int pwm = 0;
	const int LED = 3;
	
	
	void setup()
	{
	  pinMode(LED, OUTPUT);
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  valorPot = analogRead(POTENCIOMETRO);
	  pwm = map(valorPot, 0, 1023, 0, 255);
	  analogWrite(LED, pwm);
	  Serial.print("Valor pot: ");
	  Serial.print(valorPot);
	  Serial.print(" - PWM: ");
	  Serial.println(pwm);
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 12 - Código: // C++ code //…"
	RODRIGO DACOME LIMA
	Criado em: 8 de mai.8 de mai.
	Projeto 12 - Código:
	// C++ code
	//
	const int POTENCIOMETRO = A0;
	int valorLido = 0;
	const int LEDS[] = {2,3,4,5,6,7,8,9,10,11};
	const int VALORES[] = {0,114,228,342,456,570,684,798,912,1022};
	
	
	void setup()
	{
	  for(int i=0;i<10;i++){
	    pinMode(LEDS[i], OUTPUT);
	  }
	  Serial.begin(9600);
	}
	
	void loop()
	{
	  valorLido = analogRead(POTENCIOMETRO);
	  Serial.print("Valor lido: ");
	  Serial.println(valorLido);
	 
	  for(int i=0;i<10;i++){
	    if(valorLido>VALORES[i]){
	      digitalWrite(LEDS[i], HIGH);
	    }else{
	      digitalWrite(LEDS[i], LOW);
	    }
	  }
	}
	
	Adicionar comentário para a turma...
	
	
	Aviso: "Projeto 10 - Código: // C++ code //…"
	RODRIGO DACOME LIMA
	Criado em: 8 de mai.8 de mai.
	Projeto 10 - Código:
	
	// C++ code
	//
	
	const int TMP36 = A0;
	const int BUZZER = 12;
	const int LED[] = {2,3,4,5,6,7,8,9,10,11};
	const int TEMPS[] = {0,15,30,45,55,65,75,85,95,105};
	float temp = 0;
	int valorLido = 0;
	
	
	void setup()
	{
	  pinMode(BUZZER, OUTPUT);
	  for(int i=0;i<10;i++){
	    pinMode(LED[i], OUTPUT);
	  }
	}
	
	void loop()
	{
	  valorLido = analogRead(TMP36);
	  temp = ((valorLido*0.0048828125)-0.5)*100;
	  if(temp > 0){
	    delay(10);
	    valorLido = analogRead(TMP36);
	    temp = ((valorLido*0.0048828125)-0.5)*100;
	   
	    for(int i=0;i<10;i++){
	      if(temp > TEMPS[i]){
	        digitalWrite(LED[i], HIGH);
	      }else{
	        digitalWrite(LED[i], LOW);
	      }
	    }
	       
	    if(temp>TEMPS[9]){
	      tone(BUZZER, 440);
	      for(int i=0;i<10;i++){
	        digitalWrite(LED[i], HIGH);
	      }
	      delay(300);
	      for(int i=0;i<10;i++){
	        digitalWrite(LED[i], LOW);
	      }
	      delay(300);
	    }else{
	      noTone(BUZZER);
	    }
	  }
	}
}

