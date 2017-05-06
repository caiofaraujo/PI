# PI
- FLUXO JSP PARA SERVELET

// FLUXO DE FUNCIONAMENTO SERVELET > JSP
SERVERLET encaminha/realiza chamada para o JSP

ilustração:
https://ibb.co/ip0QJ5

# CONCEITO DE FILTROS
- Credenciais de usuario
- Compactação de respostas (Volumes/mbps/kbpbs/gbps)
- Logs de auditoria


1) Verificar se o usuário está logado
- Utilizar conceito de CASTING de ServeletRequest (herda) de HttpServeletRequest) 
- Necessário criar o objeto do tipo HttpServeletRequest

2) Recuperar sessão
- Utilizar um objeto do tipo HttpSession

