# 💻 Computador — Simulação de PC em Java

Classe Java que simula o comportamento básico de um computador, implementando a interface `InterfacePC`. Permite ligar/desligar a máquina, controlar o volume e gerenciar as peças instaladas.

---

## 📁 Estrutura

```
├── Computador.java      # Classe principal
├── InterfacePC.java     # Interface implementada pela classe
└── Main.java            # (opcional) Classe de teste/execução
```

---

## ⚙️ Atributos

| Atributo | Tipo | Valor Inicial | Descrição |
|---|---|---|---|
| `ligado` | `boolean` | `false` | Estado de energia do computador |
| `volume` | `int` | `50` | Volume atual (0 a 100) |
| `pecas` | `ArrayList<String>` | Intel Core I5, Radeon Rx 580 | Lista de peças instaladas |

---

## 🔧 Métodos

### Energia
| Método | Descrição |
|---|---|
| `ligar()` | Liga o computador, se estiver desligado |
| `desligar()` | Desliga o computador, se estiver ligado |

### Volume
| Método | Descrição |
|---|---|
| `maisVolume()` | Aumenta o volume em 1 (máx. 100). Requer o PC ligado |
| `menosVolume()` | Diminui o volume em 1 (mín. 0). Requer o PC ligado |

### Peças
| Método | Descrição |
|---|---|
| `adicionarPeca(String peca)` | Adiciona uma peça. Requer o PC **desligado** |
| `retirarPeca(String peca)` | Remove uma peça. Requer o PC **desligado** |
| `verificarPecas()` | Exibe todas as peças atualmente instaladas |

---

## 🚀 Exemplo de Uso

```java
Computador pc = new Computador();

pc.ligar();           // "Ligando..."
pc.maisVolume();      // "Volume: 51"
pc.verificarPecas();  // "Seu PC está com estas peças: [Intel Core I5, Radeon Rx 580]"

pc.adicionarPeca("Kingston 16GB RAM"); // "Desligue o computador primeiro!"

pc.desligar();        // "Desligando..."
pc.adicionarPeca("Kingston 16GB RAM"); // "Você adicionou esta peça: Kingston 16GB RAM"
pc.verificarPecas();  // "Seu PC está com estas peças: [Intel Core I5, Radeon Rx 580, Kingston 16GB RAM]"
```

---

## 📌 Regras de Negócio

- Só é possível **alterar o volume** com o computador **ligado**
- Só é possível **adicionar ou remover peças** com o computador **desligado**
- O volume é limitado entre **0** e **100**
- Tentar ligar um PC já ligado (ou desligar um já desligado) exibe uma mensagem de aviso

---

## 🛠️ Tecnologias

- **Java** (versão 8+)
- `java.util.ArrayList`
