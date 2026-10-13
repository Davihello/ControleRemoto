[readme_do_projeto_controle_remoto.md](https://github.com/user-attachments/files/33408789/readme_do_projeto_controle_remoto.md)
# 📺 Controle Remoto - Programação Orientada a Objetos (Java)

Este projeto é um exercício prático focado na aplicação dos conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java, abordando **Encapsulamento**, **Interfaces** e **Métodos Especiais** (Getters, Setters e Construtores).

---

## 🎯 Conceitos Aplicados

* **Encapsulamento:** Proteção dos dados internos do objeto. Atributos como `volume`, `ligado` e `tocando` são estritamente `private` e só podem ser manipulados através dos métodos da interface pública.
* **Interface (`Controlador`):** Define o contrato/comportamento esperado do controle remoto (métodos abstratos `ligar()`, `desligar()`, `abrirMenu()`, `maisVolume()`, `play()`, etc.).
* **Métodos Especiais:**
  * **Construtor:** Inicializa o estado padrão do controle (desligado, não tocando e volume em 50).
  * **Getters e Setters:** Métodos privados/protegidos utilizados internamente para ler e alterar o estado do objeto com segurança.

---

## 🛠️ Funcionalidades

- [x] Ligar e Desligar o dispositivo.
- [x] Controlar volume (Aumentar / Diminuir / Mute).
- [x] Reproduzir e Pausar conteúdos (`play` / `pause`).
- [x] Exibir menu com status detalhado e representação gráfica do volume.

---

## 🖥️ Exemplo de Saída no Console

```text
===== Menu =====
Está ligado? :true
Está tocando? :true
Volume: 15 I I
Fechando Menu...
```

---

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/controle-remoto-java.git
   ```
2. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse ou VS Code).
3. Execute o arquivo `Main.java`.

---

## 📚 Referência
Projeto desenvolvido para fins de estudo do módulo de POO em Java (inspirado nos exercícios do Curso em Vídeo - Prof. Gustavo Guanabara).
