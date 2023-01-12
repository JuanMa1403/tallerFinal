Feature: Generar una cita en el aplicativo CURA Healthcare Service
  Rule: Yo como usuario quiero agendar una cita medica de manera exitosa

    Background: Ingresar al aplicativo web
      Given que el usuario ingresa a la web

    @regresion-exito
    Scenario Outline: Iniciar sesion en el aplicativo y validar los datos para la cita medica
      When el usuario ingresa sus credenciales <usuario> y <password>
      And elige el centro de atencion <centroAtencion> y Solicitar readmision hospitalaria
      And selecciona el programa de salud, elige una fecha <fecha> y agrega comentario <comentario>
      Then verifica el contro de atencion <centroAtencion>, fecha <fecha>, comentario <comentario> y confirma la cita medica
      Examples: [HAPPY PATH]
        | usuario  | password           | centroAtencion                  | fecha      | comentario      |
        | John Doe | ThisIsNotAPassword | Hongkong CURA Healthcare Center | 30/01/2023 | Pronta atencion |