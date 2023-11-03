import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class MainApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return const Column(
      children: <Widget>[
        Stack(
//overflow: OverflowBox.visible,
          alignment: Alignment.center,
          children: <Widget>[
            Image(image: NetworkImage('https://salesystems.es/wp-content/uploads/2023/01/tecnologia-informatica-diferencias.jpg')
            ),
            Positioned(
              bottom: -50.0,
              child: CircleAvatar(
                radius: 100,
                backgroundColor: Colors.white,
                // backgroundImage: AssetImage('assets/img/Perfil.png'),
                backgroundImage: NetworkImage('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJWM_DacRq856Le43g10WXlGfQDrGVRJ8MJ1cPRaEdRdt1fmLNiugaO7ZEaFsBxXOB6GI&usqp=CAU'),
              ),
            )
          ],
        ),
        SizedBox(height: 60),
        ListTile(
          title: Center(child: Text('Nombre')),
          subtitle: Center(child: Text('Alexis')),
        ),
        ListTile(
          title: Center(child: Text('Apellido')),
          subtitle: Center(child: Text('Curo Ponce')),
        ),
        ListTile(
          title: Center(child: Text('Fecha Actual')),
          subtitle: Center(child: Text('02 de Noviembre 2023')),
        )
      ],
    );
  }
}