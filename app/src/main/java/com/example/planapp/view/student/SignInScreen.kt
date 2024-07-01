package com.example.planapp.view.student


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.planapp.R
import com.example.planapp.Screen
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.ui.theme.White



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(navController: NavController){
    var username by rememberSaveable {
        mutableStateOf("")
    }
    var identifier by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var passwordVisibility by remember { mutableStateOf(false) }
    val icon = if(passwordVisibility)
        painterResource(id = R.drawable.visible_eye)
    else
        painterResource(id = R.drawable.eye_closed)

   Column(modifier = Modifier
       .fillMaxSize()
       .background(color = White),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.spacedBy(48.dp, Alignment.CenterVertically))
   {
        Column(
            Modifier
                .width(235.dp)
                .height(158.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically))
        {
            Box(modifier = Modifier
                .height(90.dp)
                .width(90.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = "PlanXam Logo",
                    contentScale = ContentScale.FillBounds
                )
            }

            Text(
                text = "PlanXam Sign In",
                style = TextStyle(
                    fontSize = 27.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700),
                    color = MainGreen,
                )
            )
        }
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(35.dp, Alignment.CenterVertically))
        {
            OutlinedTextField(
                placeholder = {
                    Text("Enter your username",style = Typography.titleLarge)
                },
                shape = RoundedCornerShape(29.dp),
                modifier = Modifier
                    .width(350.dp)
                    .height(58.dp)
                    .shadow(4.dp, shape = shape)
                    .background(color = FillWhite), textStyle = Typography.bodyLarge, value = username, onValueChange = { newText -> username = newText },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MainGreen,
                    unfocusedBorderColor = MainGreen),
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.write_ic), contentDescription = "", tint = MainGreen, modifier = Modifier
                        .size(28.dp)
                        .offset(x = 10.dp))
                    Spacer(modifier = Modifier.size(90.dp))
                }
            )

            OutlinedTextField(
                placeholder = {
                    Text("Enter your school ID",style = Typography.titleLarge)
                },
                shape = RoundedCornerShape(29.dp),
                modifier = Modifier
                    .width(350.dp)
                    .height(58.dp)
                    .shadow(4.dp, shape = shape)
                    .background(color = FillWhite), textStyle = Typography.bodyLarge, value = identifier, onValueChange = { newText -> identifier = newText },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MainGreen,
                    unfocusedBorderColor = MainGreen),
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.cni), contentDescription = "", tint = MainGreen, modifier = Modifier
                        .size(28.dp)
                        .offset(x = 10.dp))
                    Spacer(modifier = Modifier.size(90.dp))
                }
            )
            OutlinedTextField(
                placeholder = {
                    Text("Enter your password",style = Typography.titleLarge)
                },
                shape = RoundedCornerShape(29.dp),
                modifier = Modifier
                    .width(350.dp)
                    .height(58.dp)
                    .shadow(4.dp, shape = shape,)
                    .background(color = FillWhite), textStyle = Typography.bodyLarge, value = password, onValueChange = { newText -> password = newText },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MainGreen,
                    unfocusedBorderColor = MainGreen),
                leadingIcon = {
                    IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                        Icon(painter = icon, contentDescription = "", tint = MainGreen, modifier = Modifier
                            .size(28.dp)
                            .offset(x = 10.dp))
                    }
                    Spacer(modifier = Modifier.size(90.dp))
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = if(passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation()
            )

            Demo_ExposedDropdownMenuBox()

        }
        Column (verticalArrangement = Arrangement.spacedBy(60.dp, Alignment.CenterVertically)){
            Row (modifier = Modifier.offset(y = -20.dp)){
                Spacer(modifier = Modifier.width(120.dp))
                Text(modifier = Modifier.clickable {
                    navController.navigate(route = Screen.Login.route)
                }, text = "Do you already have an account ?",color = MainGreen, fontFamily = FontFamily.SansSerif)
            }
            Button(onClick = { /*TODO*/ },colors = ButtonDefaults.buttonColors(
                containerColor = MainGreen
            ),modifier = Modifier
                .width(350.dp)
                .height(58.dp)) {
                Text(text = "Sign In", style = Typography.bodyLarge, fontSize = 25.sp)
            }
        }
   }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Demo_ExposedDropdownMenuBox() {
    val context = LocalContext.current
    val coffeeDrinks = arrayOf("Americano", "Cappuccino", "Espresso", "Latte", "Mocha")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(coffeeDrinks[0]) }

    Box(
        modifier = Modifier
            .border(1.dp, MainGreen, RoundedCornerShape(29.dp))
            .width(350.dp)
            .height(58.dp)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            TextField(
                value = selectedText,
                onValueChange = {},
                colors = TextFieldDefaults.colors(unfocusedContainerColor = FillWhite, focusedContainerColor = FillWhite),
                leadingIcon = { Icon(imageVector = Icons.Default.School, contentDescription = "",
                    tint = MainGreen,modifier = Modifier
                        .size(28.dp)
                        .offset(x = 10.dp))
                    Spacer(modifier = Modifier.size(90.dp)) },
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier
                    .menuAnchor()
                    .width(350.dp)
                    .height(58.dp)
                    .shadow(4.dp, shape = shape)
                    .background(color = Color.White, shape = RoundedCornerShape(29.dp)), textStyle = Typography.titleLarge
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                coffeeDrinks.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(text = item) },
                        onClick = {
                            selectedText = item
                            expanded = false
                            Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevSignIn(){
    SignInScreen(
        navController = rememberNavController()
    )
}